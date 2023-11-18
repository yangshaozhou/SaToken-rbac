package com.rbacpermit;

import com.rbacpermit.domin.dto.UserDto;
import com.rbacpermit.permit.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class RbacPermitApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        UserDto userDto = new UserDto();
        userDto.setUsername("to_tree");
        userDto.setPassword("12345");
        userService.loginByPass(userDto);
//        System.out.println("登录成功");
    }

}
