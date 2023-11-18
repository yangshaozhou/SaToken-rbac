package com.rbacpermit.permit.controller;


import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.util.StrUtil;
import com.rbacpermit.domin.dto.UserDto;
import com.rbacpermit.exception.Asserts;
import com.rbacpermit.permit.service.UserService;
import com.rbacpermit.util.RestResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author free_sky
 * @since 2023-11-16
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 用户登录
     */
    @PostMapping("/login")

    public  RestResp<SaTokenInfo>  userRegister(@Validated @RequestBody UserDto userDto) {

//        String username = userDto.getUsername();
//        String password = userDto.getPassword();
//        log.info("用户名: {}, 密码: {}",username,password);
//        if("to_tree".equals(username) && "12345".equals(password)) {
//            StpUtil.login(1001);
//            return "success";
//        }
//        return "fail";


    userService.loginByPass(userDto);

        if(!StpUtil.isLogin()) {
//            登录失败
            Asserts.fail("登录失败");
        }

        return RestResp.ok(StpUtil.getTokenInfo());
    }
}

