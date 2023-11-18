package com.rbacpermit.permit.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.rbac.permit.domain.entity.UserEntity;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rbacpermit.domin.dto.UserDto;
import com.rbacpermit.permit.mapper.UserMapper;
import com.rbacpermit.permit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author free_sky
 * @since 2023-11-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

    @Autowired
    private UserMapper userMapper;
    /**
     * 登录请求
     * @param userDto
     */
    @Override
    public void loginByPass(UserDto userDto) {
//        获取用户名
        String name = userDto.getUsername();
//        获取密码
        String password = userDto.getPassword();
        LambdaQueryWrapper<UserEntity> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(UserEntity::getUsername, name).eq(UserEntity::getPassword,password);
        UserEntity user = userMapper.selectOne(lambdaQueryWrapper);

        if(user != null) {
            StpUtil.login(user.getId());
        }

    }
}
