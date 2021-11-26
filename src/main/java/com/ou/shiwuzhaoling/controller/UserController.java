package com.ou.shiwuzhaoling.controller;

import com.ou.shiwuzhaoling.common.Result;
import com.ou.shiwuzhaoling.entity.po.User;
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
    public Result<User> login(User user){
        User res = userService.userLogin(user.getUserMobile(),user.getUserPassword());
        return Result.OK(res);
    }

    @ApiOperation("用户-注册")
    @PostMapping (value = "/register")
    public Result Register(User user){
        boolean res = userService.userRegister(user);
        return res ? Result.OK() : Result.error("该手机已被注册");
    }

    @ApiOperation("用户-修改个人信息")
    @PostMapping (value = "/modify")
    public Result Modify(@RequestBody User user){
        boolean res = userService.modifyInformation(user, user.getUserName(),user.getUserPassword(), user.getUserMobile(),user.getUserSex());
        return res ? Result.OK() : Result.error("修改失败");
    }



}
