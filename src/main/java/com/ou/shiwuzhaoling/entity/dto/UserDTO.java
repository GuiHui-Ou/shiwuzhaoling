package com.ou.shiwuzhaoling.entity.dto;

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
public class UserDTO {

    @ApiModelProperty("用户Id")
    private Integer userId;

    @ApiModelProperty("用户姓名")
    private String userName;

    @ApiModelProperty("用户密码")
    private String userPassword;

    @ApiModelProperty("用户手机号")
    private String userMobile;

    public User toUserPO() {
        User user = new User();
        user.setUserId(this.userId);
        user.setUserName(this.userName);
        user.setUserPassword(this.userPassword);
        user.setUserMobile(this.userMobile);
        return user;
    }


}
