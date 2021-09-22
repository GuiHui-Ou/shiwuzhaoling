package com.ou.shiwuzhaoling.entity.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @author leo
 */
@Data
@ApiModel("请求管理员信息")
public class ManageRequest {

    private String managementMobile;

    private String managementPassword;
}
