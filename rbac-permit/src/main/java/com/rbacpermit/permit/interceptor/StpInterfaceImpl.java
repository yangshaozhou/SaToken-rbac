package com.rbacpermit.permit.interceptor;

import cn.dev33.satoken.stp.StpInterface;
import com.rbacpermit.permit.mapper.MenuMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class StpInterfaceImpl implements StpInterface {

    @Autowired
    private MenuMapper menuMapper;


    /**
     * 操作：
     * 1. 通过id获取角色
     * 2. 通过角色获取权限
     */

    /**
     * 返回拥有的权限列表
     * @param
     * @param s
     * @return
     */


//    注意：sa-token中的loginId的Object不能强制转换，必须要通过Long的自动装配
    @Override
    public List<String> getPermissionList(Object loginId, String s) {

        Long userId = Long.valueOf((String) loginId);
        List<String> permitList = menuMapper.searchPermitById(userId);
        log.info("permit:{}",permitList.toString());
        return permitList;
    }

    /**
     * 返回拥有的角色列表，可以作为后台设置权限的设置权限选项
     * @param
     * @param s
     * @return
     */
    @Override
    public List<String> getRoleList(Object loginId, String s) {
        return null;
    }
}
