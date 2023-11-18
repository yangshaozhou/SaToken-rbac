package com.rbac.permit.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 角色
 * </p>
 *
 * @author free_sky
 * @since 2023-11-16
 */
@TableName("role")
@ApiModel(value = "RoleEntity对象", description = "角色")
public class RoleEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String roleName;

    private Integer isDelete;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "RoleEntity{" +
        "id=" + id +
        ", roleName=" + roleName +
        ", isDelete=" + isDelete +
        "}";
    }
}
