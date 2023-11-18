package com.rbacpermit.permit.mapper;

import com.rbac.permit.domain.entity.MenuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 权限表 Mapper 接口
 * </p>
 *
 * @author free_sky
 * @since 2023-11-16
 */
@Mapper
public interface MenuMapper extends BaseMapper<MenuEntity> {

    /**
     * 查找用户权限
     */

    List<String> searchPermitById(@Param("userId") Long userId);
}
