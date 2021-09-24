package com.ou.shiwuzhaoling.controller;

import com.ou.shiwuzhaoling.common.Result;
import com.ou.shiwuzhaoling.entity.dto.ClaimDTO;
import com.ou.shiwuzhaoling.entity.po.Claim;
import com.ou.shiwuzhaoling.service.ClaimService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
/**
 * @author leo
 */
@RestController
@RequestMapping("/claim")
@Api(tags = "认领信息")
public class ClaimController {

    @Autowired
    ClaimService claimService;

    @ApiOperation("认领-增加认领信息")
    @PostMapping(value = "/insert")
    public Result insertClaim(@RequestBody ClaimDTO claimDTO){
        claimService.insertClaim(claimDTO);
        return Result.OK();
    }

    @ApiOperation("认领-查找全部认领信息")
    @GetMapping(value = "/query")
    public Result<List<Claim>> queryClaim(){
        List<Claim> claims = claimService.queryClaim();
        return Result.OK(claims);
    }


}
