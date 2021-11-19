package com.ou.shiwuzhaoling.controller;

import com.ou.shiwuzhaoling.common.Result;
import com.ou.shiwuzhaoling.entity.po.User;
import com.ou.shiwuzhaoling.service.UserService;
import com.ou.shiwuzhaoling.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author leo
 */
@RestController
@RequestMapping(value = "/user")
@Api(tags = "用户信息")
@CrossOrigin("*")
public class UserController{

    @Autowired
    UserServiceImpl userService;

    @ApiOperation("用户-登录验证")
    @GetMapping(value = "/login")
    public Result login(User user){
        boolean res = userService.userLogin(user.getUserMobile(),user.getUserPassword());
        return res ? Result.OK() : Result.error("没有该用户");
    }

    @ApiOperation("用户-注册")
    @PostMapping (value = "/register")
    public Result Register(User user){
        boolean res = userService.userRegister(user);
        return res ? Result.OK() : Result.error("该手机已被注册");
    }

}
