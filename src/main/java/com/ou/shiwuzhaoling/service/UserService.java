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
    User userLogin(String userMobile, String userPassword);

    /**
     * 用户注册
     * @param user
     * @return
     */
    boolean userRegister(User user);

    /**
     * 用户修改个人信息
     * @param user
     * @param userName
     * @param userPassword
     * @param userMobile
     * @param userSex
     * @return
     */
    boolean modifyInformation(User user,String userName,String userPassword,String userMobile,Integer userSex);
}
