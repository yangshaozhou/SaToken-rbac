package com.rbacpermit.permit.service.impl;

import com.rbac.permit.domain.entity.RoleEntity;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rbacpermit.permit.mapper.RoleMapper;
import com.rbacpermit.permit.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色 服务实现类
 * </p>
 *
 * @author free_sky
 * @since 2023-11-16
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, RoleEntity> implements RoleService {

}
