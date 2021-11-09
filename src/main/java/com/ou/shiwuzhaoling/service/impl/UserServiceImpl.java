package com.ou.shiwuzhaoling.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ou.shiwuzhaoling.entity.po.User;
import com.ou.shiwuzhaoling.mapper.UserMapper;
import com.ou.shiwuzhaoling.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author leo
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

    @Override
    public boolean userLogin(String userMobile, String userPassword) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>(User.class);
        queryWrapper.eq(User::getUserMobile,userMobile)
                .eq(User::getUserPassword,userPassword);
        User user =  baseMapper.selectOne(queryWrapper);
        if(userMobile != null && userPassword != null && user != null){
                return true;
        }
        return false;
    }

    @Override
    public boolean userRegister(User user) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>(User.class);
        queryWrapper.eq(User::getUserMobile,user.getUserMobile());
        //判断手机号是否为空
        if (user.getUserMobile() != null){
            User user1 = baseMapper.selectOne(queryWrapper);
            //判断手机是否存在
            if (user1 == null && user.getUserPassword() != null && user.getUserMobile().length() == 11 && user.getUserName() != null){
                baseMapper.insert(user);
                return true;
            }
        }
        return false;
    }
}
