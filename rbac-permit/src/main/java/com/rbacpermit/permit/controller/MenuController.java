package com.rbacpermit.permit.controller;


import com.rbacpermit.util.RestResp;
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
public class MenuController {

    @PostMapping("/add")
    public RestResp<Void> addMenu(){
        return RestResp.ok();
    }
}

