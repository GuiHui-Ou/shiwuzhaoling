package com.ou.shiwuzhaoling.controller;

import com.ou.shiwuzhaoling.common.Result;
import com.ou.shiwuzhaoling.entity.dto.UserDTO;
import com.ou.shiwuzhaoling.entity.request.UserRequest;
import com.ou.shiwuzhaoling.service.UserService;
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
public class UserController{

    @Autowired
    UserService userService;

    @ApiOperation("用户-登录验证")
    @PostMapping (value = "/login")
    public Result login(@RequestBody UserRequest request){
        boolean res = userService.userLogin(request.getUserMobile(),request.getUserPassword());
        return res ? Result.OK() : Result.error("没有该用户");
    }

    @ApiOperation("用户-注册")
    @PostMapping (value = "/register")
    public Result Register(@RequestBody UserDTO userDTO){
        boolean res = userService.userRegister(userDTO);
        return res ? Result.OK() : Result.error("该手机已被注册");
    }

}
