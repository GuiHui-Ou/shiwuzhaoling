package com.ou.shiwuzhaoling.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ou.shiwuzhaoling.entity.po.User;

/**
 * @author leo
 */
public interface UserService extends IService<User> {

    /**
     * 用户登陆验证
     * @param userMobile
     * @param userPassword
     * @return
     */
    boolean userLogin(String userMobile, String userPassword);

    /**
     * 用户注册
     * @param user
     * @return
     */
    boolean userRegister(User user);
}
