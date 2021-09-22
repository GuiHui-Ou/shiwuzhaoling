package com.ou.shiwuzhaoling.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ou.shiwuzhaoling.entity.dto.GoodsDTO;
import com.ou.shiwuzhaoling.entity.po.Goods;
import java.util.List;
import java.awt.*;

/**
 * @author leo
 */
public interface GoodsService extends IService<Goods> {
    /**
     * 查询所有失物
     * @param pageNum
     * @param pageSize
     * @return
     */
    IPage<Goods> queryGoods(Integer pageNum, Integer pageSize);

    /**
     * 插入失物信息
     * @param goodsDTO
     * @return
     */
    boolean insertGoods(GoodsDTO goodsDTO);

    /**
     * 删除失物信息
     * @param goodsId
     * @return
     */
    boolean deleteGoods(Integer goodsId);

    /**
     * 更新失物信息
     * @param goodsDTO
     * @return
     */
    boolean updateGoods(GoodsDTO goodsDTO);
}
