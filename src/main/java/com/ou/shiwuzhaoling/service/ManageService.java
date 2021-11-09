package com.ou.shiwuzhaoling.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ou.shiwuzhaoling.entity.po.Manage;

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

}
