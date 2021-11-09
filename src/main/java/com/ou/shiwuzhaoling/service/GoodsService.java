package com.ou.shiwuzhaoling.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ou.shiwuzhaoling.entity.po.Goods;

import java.util.Date;
import java.util.List;



/**
 * @author leo
 */
public interface GoodsService extends IService<Goods> {
    /**
     * 查询所有失物,或根据认领状态查询
     * @param goodsStatus
     * @return
     */
    List<Goods> queryGoods(Integer goodsStatus);

    /**
     * 插入失物信息
     * @param goods
     * @return
     */
    boolean insertGoods(Goods goods);

    /**
     * 删除失物信息
     * @param goodsId
     * @return
     */
    boolean deleteGoods(Integer goodsId);

    /**
     * 更新失物信息
     * @param goods
     * @return
     */
    boolean updateGoods(Goods goods);

    /**
     * 失物认领
     * @param claimTime
     * @param claimDesc
     * @param userId
     * @param userName
     * @return
     */
    boolean claimGoods(Goods goods,Date claimTime,String claimDesc,Integer userId,String userName);

    /**
     * 确认认领
     * @param goods
     * @return
     */
    boolean enterClaim(Goods goods);

    /**
     * 取消认领
     * @param goods
     * @return
     */
    boolean cancelClaim(Goods goods);

    /**
     * 用户认领的失物
     * @param userId
     * @return Goods
     */
    List<Goods>userClaim(Integer userId);

    /**
     * 认领的总数
     * @return
     */
    int Num();

}
