package com.ou.shiwuzhaoling.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ou.shiwuzhaoling.entity.dto.ClaimDTO;
import com.ou.shiwuzhaoling.entity.po.Claim;
import com.ou.shiwuzhaoling.mapper.ClaimMapper;
import com.ou.shiwuzhaoling.service.ClaimService;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author leo
 */
@Service
public class ClaimServiceImpl extends ServiceImpl<ClaimMapper, Claim> implements ClaimService {

    @Override
    public boolean insertClaim(ClaimDTO claimDTO){
        if (claimDTO != null) {
            baseMapper.insert(claimDTO.toClaimPO());
            return true;
        }
        return false;
    }

    @Override
    public List<Claim> queryClaim() {
        List<Claim> claimInfo =baseMapper.selectList(null);
        return claimInfo;
    }


}
