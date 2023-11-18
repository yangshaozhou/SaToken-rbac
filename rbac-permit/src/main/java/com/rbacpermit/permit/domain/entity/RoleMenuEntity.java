package com.rbac.permit.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author free_sky
 * @since 2023-11-16
 */
@TableName("role_menu")
@ApiModel(value = "RoleMenuEntity对象", description = "")
public class RoleMenuEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long roleId;

    private Integer isDelete;

    private Long menuId;


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

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    @Override
    public String toString() {
        return "RoleMenuEntity{" +
        "id=" + id +
        ", roleId=" + roleId +
        ", isDelete=" + isDelete +
        ", menuId=" + menuId +
        "}";
    }
}
