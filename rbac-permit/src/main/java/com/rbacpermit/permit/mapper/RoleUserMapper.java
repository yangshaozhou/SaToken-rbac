package com.rbacpermit.permit.mapper;

import com.rbac.permit.domain.entity.RoleUserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 角色_用户 Mapper 接口
 * </p>
 *
 * @author free_sky
 * @since 2023-11-16
 */
@Mapper
public interface RoleUserMapper extends BaseMapper<RoleUserEntity> {

}
