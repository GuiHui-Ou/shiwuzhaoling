package com.ou.shiwuzhaoling.entity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ou.shiwuzhaoling.entity.po.Claim;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author leo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel("认领失物")
public class ClaimDTO {

    private Integer Id;

    private String claimDesc;

    private String claimUser;

    private Date claimTime;

    public Claim toClaimPO() {
        Claim claim = new Claim();
        claim.setId(this.Id);
        claim.setClaimDesc(this.claimDesc);
        claim.setClaimUser(this.claimUser);
        claim.setClaimTime(this.claimTime);
        return claim;
    }
}
