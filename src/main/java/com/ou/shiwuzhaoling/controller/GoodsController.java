package com.ou.shiwuzhaoling.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ou.shiwuzhaoling.common.BaseController;
import com.ou.shiwuzhaoling.common.Result;
import com.ou.shiwuzhaoling.entity.po.Goods;
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

    @ApiOperation("失物-查找全部或根据认领状态或根据认领类型查找")
    @GetMapping(value = "/query")
    public Result<IPage<Goods>> queryGoods(@RequestBody Goods goods){
        Integer pageNum = getIntParam(goods.getPageNum(), 1);
        Integer pageSize = getPageSize(goods.getPageSize(), 5);
        IPage<Goods> page = goodsService.queryGoods(pageNum, pageSize, goods.getGoodsType() ,goods.getGoodsStatus());
        return Result.OK(page);
    }

    @ApiOperation("失物-添加失物")
    @PostMapping(value = "/insert")
    public Result insertGoods(@RequestBody Goods goods){
        goodsService.insertGoods(goods);
        return Result.OK();
    }

    @ApiOperation("失物-删除失物")
    @PostMapping(value = "/delete")
    public Result deleteGoods(@RequestBody Goods goods){
        goodsService.deleteGoods(goods.getGoodsId());
        return Result.OK();
    }

    @ApiOperation("失物-编辑失物信息")
    @PostMapping(value = "/update")
    public Result updateGoods(@RequestBody Goods goods){
        goodsService.updateGoods(goods);
        return Result.OK();
    }

    @ApiOperation("失物-申请确定失物认领")
    @PostMapping(value = "/claim")
    public Result claimGoods(@RequestBody Goods goods){
        goodsService.claimGoods(goods,goods.getClaimTime(),goods.getClaimDesc(),goods.getUserId(),goods.getUserName());
        return Result.OK();
    }

    @ApiOperation("失物-确定失物认领")
    @PostMapping(value = "/enter")
    public Result enterClaim(@RequestBody Goods goods){
        goodsService.enterClaim(goods);
        return Result.OK();
    }

    @ApiOperation("失物-取消失物认领")
    @PostMapping(value = "/cancel")
    public Result cancelClaim(@RequestBody Goods goods){
        goodsService.cancelClaim(goods);
        return Result.OK();
    }
}
