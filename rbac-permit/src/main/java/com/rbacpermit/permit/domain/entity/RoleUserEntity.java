package com.rbac.permit.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 角色_用户
 * </p>
 *
 * @author free_sky
 * @since 2023-11-16
 */
@TableName("role_user")
@ApiModel(value = "RoleUserEntity对象", description = "角色_用户")
public class RoleUserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long roleId;

    private Long userId;

    private Integer isDelete;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "RoleUserEntity{" +
        "id=" + id +
        ", roleId=" + roleId +
        ", userId=" + userId +
        ", isDelete=" + isDelete +
        "}";
    }
}
