package com.ou.shiwuzhaoling.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ou.shiwuzhaoling.entity.po.Goods;
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
     * 用户发布失物信息
     * @param goods
     * @return
     */
    boolean insertGoods(Goods goods);

    /**
     * 管理员删除失物信息
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
     * 用户认领失物并填写认领信息
     * @param goods
     * @param claimDesc
     * @param userId
     * @param userName
     * @return boolean
     */
    boolean claimGoods(Goods goods,String claimDesc,Integer userId,String userName);

    /**
     * 管理员确认认领
     * @param goods
     * @return
     */
    boolean enterClaim(Goods goods);

    /**
     * 用户取消认领失物
     * @param goods
     * @return
     */
    boolean cancelClaim(Goods goods);

    /**
     * 用户查看自己认领的失物的状态
     * @param userId
     * @return Goods
     */
    List<Goods> userClaim(Integer userId);

    /**
     * 失物的总数
     * @return
     */
    int Num();

    /**
     * 根据goods Name模糊查询
     * @param goodsName
     * @return
     */
    List<Goods> queryGoodsByName(String goodsName);

}
