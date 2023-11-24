package com.rbacpermit;

import cn.dev33.satoken.SaManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RbacPermitApplication {

    public static void main(String[] args) {
     ConfigurableApplicationContext context =  SpringApplication.run(RbacPermitApplication.class, args);
        System.out.println("启动成功，Sa-Token 配置如下：" + SaManager.getConfig());
    }

}
