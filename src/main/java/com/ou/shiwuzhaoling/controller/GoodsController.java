package com.ou.shiwuzhaoling.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ou.shiwuzhaoling.common.BaseController;
import com.ou.shiwuzhaoling.common.Result;
import com.ou.shiwuzhaoling.entity.dto.GoodsDTO;
import com.ou.shiwuzhaoling.entity.po.Goods;
import com.ou.shiwuzhaoling.entity.request.GoodsRequest;
import com.ou.shiwuzhaoling.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author leo
 */
@RestController
@RequestMapping("/goods")
@Api(tags = "失物信息")
public class GoodsController extends BaseController {

    @Autowired
    GoodsService goodsService;

    @ApiOperation("失物-查找全部或根据认领状态查找")
    @GetMapping(value = "/query")
    public Result<IPage<Goods>> queryGoods(@RequestBody GoodsRequest request){
        Integer pageNum = getIntParam(request.getPageNum(), 1);
        Integer pageSize = getPageSize(request.getPageSize(), 5);
        IPage<Goods> page = goodsService.queryGoods(pageNum, pageSize, request.getGoodsType() ,request.getGoodsStatus());
        return Result.OK(page);
    }

    @ApiOperation("失物-添加失物")
    @PostMapping(value = "/insert")
    public Result insertGoods(@RequestBody GoodsDTO goodsDTO){
        goodsService.insertGoods(goodsDTO);
        return Result.OK();
    }

    @ApiOperation("失物-删除失物")
    @PostMapping(value = "/delete")
    public Result deleteGoods(@RequestBody GoodsRequest request){
        goodsService.deleteGoods(request.getGoodsId());
        return Result.OK();
    }

    @ApiOperation("失物-编辑失物信息")
    @PostMapping(value = "/update")
    public Result updateGoods(@RequestBody GoodsDTO goodsDTO){
        goodsService.updateGoods(goodsDTO);
        return Result.OK();
    }

    @ApiOperation("失物-申请确定失物认领")
    @PostMapping(value = "/claim")
    public Result claimGoods(@RequestBody GoodsRequest request){
        goodsService.claimGoods(request.getGoodsId(),request.getGoodsStatus());
        return Result.OK();
    }


}
