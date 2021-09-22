package com.ou.shiwuzhaoling.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ou.shiwuzhaoling.entity.po.Manage;
import com.ou.shiwuzhaoling.entity.request.ManageRequest;

/**
 * @author leo
 */
public interface ManageService extends IService<Manage> {

    /**
     * 管理员登陆
     * @param managementMobile
     * @param managementPassword
     * @return
     */
    boolean manageLogin(String managementMobile , String managementPassword);

    Manage selectOne(String managementMobile , String managementPassword);
}
