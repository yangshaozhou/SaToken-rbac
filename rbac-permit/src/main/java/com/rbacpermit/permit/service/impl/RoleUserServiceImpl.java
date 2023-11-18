package com.rbacpermit.permit.service.impl;

import com.rbac.permit.domain.entity.RoleUserEntity;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rbacpermit.permit.mapper.RoleUserMapper;
import com.rbacpermit.permit.service.RoleUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色_用户 服务实现类
 * </p>
 *
 * @author free_sky
 * @since 2023-11-16
 */
@Service
public class RoleUserServiceImpl extends ServiceImpl<RoleUserMapper, RoleUserEntity> implements RoleUserService {

}
