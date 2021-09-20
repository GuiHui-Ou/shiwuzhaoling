package com.ou.shiwuzhaoling.entity.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ou.shiwuzhaoling.entity.po.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author leo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel("用户信息")
public class UserInfo {

    @ApiModelProperty("用户Id")
    private Integer userId;

    @ApiModelProperty("用户姓名")
    private String userName;

    @ApiModelProperty("用户密码")
    private String userPassword;

    @ApiModelProperty("用户手机号")
    private String userMobile;

    public UserInfo parseFromPO(User po) {
        userId = po.getUserId();
        userName = po.getUserName();
        userPassword = po.getUserPassword();
        userMobile = po.getUserMobile();
        return this;
    }
}
