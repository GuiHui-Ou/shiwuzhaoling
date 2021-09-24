package com.ou.shiwuzhaoling.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ou.shiwuzhaoling.entity.dto.ClaimDTO;
import com.ou.shiwuzhaoling.entity.po.Claim;
import java.util.List;

/**
 * @author leo
 */
public interface ClaimService extends IService<Claim> {

    /**
     * 插入认领信息
     * @param claimDTO
     * @return
     */
    boolean insertClaim(ClaimDTO claimDTO);

    /**
     * 查找认领信息
     * @return
     */
    List<Claim> queryClaim();
}
