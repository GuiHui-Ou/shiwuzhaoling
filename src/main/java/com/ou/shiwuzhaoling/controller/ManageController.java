package com.ou.shiwuzhaoling.controller;

import com.ou.shiwuzhaoling.common.Result;
import com.ou.shiwuzhaoling.entity.po.Manage;
import com.ou.shiwuzhaoling.service.ManageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leo
 */
@RestController
@RequestMapping("/manage")
@Api(tags = "管理员信息")
public class ManageController {

    @Autowired
    ManageService manageService;

    @ApiModelProperty("管理员登陆")
    @PostMapping(value = "/login")
    public Result login(@RequestBody Manage manage){
        boolean res = manageService.manageLogin(manage.getManagementMobile(),manage.getManagementPassword());
        return res ? Result.OK() : Result.error("没有该用户");
    }

}
