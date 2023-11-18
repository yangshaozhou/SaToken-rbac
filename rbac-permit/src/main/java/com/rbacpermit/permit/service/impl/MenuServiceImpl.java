package com.rbacpermit.permit.service.impl;

import com.rbac.permit.domain.entity.MenuEntity;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rbacpermit.permit.mapper.MenuMapper;
import com.rbacpermit.permit.service.MenuService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author free_sky
 * @since 2023-11-16
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, MenuEntity> implements MenuService {

}
