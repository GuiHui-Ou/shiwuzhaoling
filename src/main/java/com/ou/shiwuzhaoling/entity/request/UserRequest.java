package com.ou.shiwuzhaoling.entity.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author leo
 */
@Data
@ApiModel("请求用户信息")
public class UserRequest {

    @ApiModelProperty("用户姓名")
    private String userName;

    @ApiModelProperty("用户密码")
    private String userPassword;

    @ApiModelProperty("用户手机号")
    private String userMobile;
}
