package com.rbacpermit.permit.service;

import com.rbac.permit.domain.entity.UserEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.rbacpermit.domin.dto.UserDto;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author free_sky
 * @since 2023-11-16
 */
public interface UserService extends IService<UserEntity> {

    void loginByPass(UserDto userDto);

}
