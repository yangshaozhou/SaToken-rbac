package com.rbacpermit.permit.controller;


import cn.dev33.satoken.stp.StpUtil;
import com.rbacpermit.util.RestResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 权限表 前端控制器
 * </p>
 *
 * @author free_sky
 * @since 2023-11-16
 */

@RestController
@RequestMapping("/menu")
@Slf4j
public class MenuController {

    @PostMapping("/add")
    public RestResp<Void> addMenu(){
        log.info((String) StpUtil.getLoginId());
        Object id =StpUtil.getLoginId();
        log.info(StpUtil.getPermissionList(id).toString());
        return RestResp.ok();
    }
}

