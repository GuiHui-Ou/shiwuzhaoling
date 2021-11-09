package com.ou.shiwuzhaoling.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ou.shiwuzhaoling.entity.po.Goods;
import com.ou.shiwuzhaoling.mapper.GoodsMapper;
import com.ou.shiwuzhaoling.service.GoodsService;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;


/**
 * @author leo
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

    @Override
    public List<Goods> queryGoods(String goodsType , Integer goodsStatus){
        LambdaQueryWrapper<Goods> queryWrapper = new LambdaQueryWrapper<>(Goods.class);
        if (goodsStatus != null){
            queryWrapper.eq(Goods::getGoodsStatus,goodsStatus);
        }
        if (goodsType != null){
            queryWrapper.eq(Goods::getGoodsType,goodsType);
        }
        return baseMapper.selectList(queryWrapper);
    }

    @Override
    public boolean insertGoods(Goods goods){
        if (goods != null) {
            baseMapper.insert(goods);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteGoods(Integer goodsId) {
        baseMapper.deleteById(goodsId);
        return true;
    }

    @Override
    public boolean updateGoods(Goods goods) {
        if (goods != null) {
            baseMapper.updateById(goods);
        }
        return true;
    }

    @Override
    public boolean claimGoods(Goods goods,Date claimTime, String claimDesc, Integer userId, String userName) {
        if (goods != null){
            goods.setClaimTime(claimTime);
            goods.setClaimDesc(claimDesc);
            goods.setGoodsStatus(1);
            goods.setUserId(userId);
            goods.setUserName(userName);
            baseMapper.updateById(goods);
        }
        return true;
    }

    @Override
    public boolean enterClaim(Goods goods) {
        if (goods != null){
            goods.setGoodsStatus(2);
            baseMapper.updateById(goods);
        }
        return true;
    }

    @Override
    public boolean cancelClaim(Goods goods) {
        if (goods != null){
            goods.setGoodsStatus(0);
            baseMapper.updateById(goods);
        }
        return true;
    }

    @Override
    public  List<Goods> userClaim(Integer userId) {
        LambdaQueryWrapper<Goods> queryWrapper = new LambdaQueryWrapper<>(Goods.class);
        queryWrapper.eq(Goods::getUserId,userId);
        return baseMapper.selectList(queryWrapper);
    }



}
