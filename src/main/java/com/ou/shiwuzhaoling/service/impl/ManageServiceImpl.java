package com.ou.shiwuzhaoling.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ou.shiwuzhaoling.entity.po.Manage;
import com.ou.shiwuzhaoling.mapper.ManageMapper;
import com.ou.shiwuzhaoling.service.ManageService;
import org.springframework.stereotype.Service;

/**
 * @author leo
 */
@Service
public class ManageServiceImpl extends ServiceImpl<ManageMapper, Manage> implements ManageService {

    @Override
    public boolean manageLogin(String managementMobile, String managementPassword) {
        LambdaQueryWrapper<Manage> lambdaQueryWrapper = new LambdaQueryWrapper<>(Manage.class);

        if (managementMobile != null && managementPassword != null) {
            lambdaQueryWrapper.eq(Manage::getManagementMobile, managementMobile)
                    .eq(Manage::getManagementPassword, managementPassword);
            Manage manage = baseMapper.selectOne(lambdaQueryWrapper);
            if (manage != null) {
                return true;
            }
        }
        return false;
    }

}
