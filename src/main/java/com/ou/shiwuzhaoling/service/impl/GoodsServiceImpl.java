package com.ou.shiwuzhaoling.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ou.shiwuzhaoling.entity.dto.GoodsDTO;
import com.ou.shiwuzhaoling.entity.po.Goods;
import com.ou.shiwuzhaoling.mapper.GoodsMapper;
import com.ou.shiwuzhaoling.service.GoodsService;
import org.springframework.stereotype.Service;


/**
 * @author leo
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {


    @Override
    public IPage<Goods> queryGoods(Integer pageNum, Integer pageSize, String goodsType , Integer goodsStatus){
        Page<Goods> page = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<Goods> queryWrapper = new LambdaQueryWrapper<>(Goods.class);
        if (goodsStatus != null){
            queryWrapper.eq(Goods::getGoodsStatus,goodsStatus);
        }
        if (goodsType != null){
            queryWrapper.eq(Goods::getGoodsType,goodsType);
        }
        return baseMapper.selectPage(page,queryWrapper);
    }

    @Override
    public boolean insertGoods(GoodsDTO goodsDTO){
        if (goodsDTO != null) {
            baseMapper.insert(goodsDTO.toGoodsPO());
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
    public boolean updateGoods(GoodsDTO goodsDTO) {
        if (goodsDTO != null) {
            baseMapper.updateById(goodsDTO.toGoodsPO());
        return true;
        }
        return true;
    }

    @Override
    public boolean claimGoods(Integer goodsId , Integer goodsStatus) {
        Goods goods = new Goods();
        goods.setGoodsId(goodsId);
        if (goodsStatus == 0){
            goods.setGoodsStatus(1);

        }if(goodsStatus == 1){
            goods.setGoodsStatus(2);
        }
        baseMapper.updateById(goods);
        return true;
    }


}
