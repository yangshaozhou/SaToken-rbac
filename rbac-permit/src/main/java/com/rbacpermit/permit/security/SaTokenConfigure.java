package com.rbacpermit.permit.security;

import cn.dev33.satoken.reactor.filter.SaReactorFilter;
import cn.dev33.satoken.router.SaRouter;
import cn.dev33.satoken.stp.StpUtil;
import cn.dev33.satoken.util.SaResult;
import com.rbacpermit.util.RestResp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class SaTokenConfigure  {

    @Bean
    public SaReactorFilter getSaReactorFilter() {
        return new SaReactorFilter()
                // 指定 [拦截路由]
                .addInclude("/**")    /* 拦截所有path */
                // 指定 [放行路由]
//                .addExclude("/favicon.ico")
                // 指定[认证函数]: 每次请求执行
                .setAuth(obj -> {
                     SaRouter.match("/**")
                             .notMatch("/user/login")
                             .check(r ->
                                     StpUtil.checkLogin());
//                    sa-token路由权限认证
                     SaRouter.match("/menu/**", r -> StpUtil.checkPermissionOr("writer"));

                })
                // 指定[异常处理函数]：每次[认证函数]发生异常时执行此函数
                .setError(e -> {
                    System.out.println("---------- sa全局异常 ");
                    return SaResult.error(e.getMessage());
                });
    }
}
