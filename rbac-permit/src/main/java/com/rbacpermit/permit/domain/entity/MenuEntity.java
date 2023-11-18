package com.rbac.permit.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;


/**
 * <p>
 * 权限表
 * </p>
 *
 * @author free_sky
 * @since 2023-11-16
 */
@TableName("menu")
@ApiModel(value = "MenuEntity对象", description = "权限表")
public class MenuEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String menuName;

    private Integer isDelete;

    private Long parentId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "MenuEntity{" +
        "id=" + id +
        ", menuName=" + menuName +
        ", isDelete=" + isDelete +
        ", parentId=" + parentId +
        "}";
    }
}
