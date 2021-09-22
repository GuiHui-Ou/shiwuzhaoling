package com.ou.shiwuzhaoling.entity.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ou.shiwuzhaoling.entity.po.Goods;
import com.ou.shiwuzhaoling.entity.po.User;
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
@ApiModel("失物信息")
public class GoodsInfo {

    private Integer goodsId;

    private String goodsName;

    private String goodsDesc;

    private String goodsPicker;

    private String pickAddress;

    private Date pickTime;

    public GoodsInfo parseFromPO(Goods po) {
        goodsId = po.getGoodsId();
        goodsName = po.getGoodsName();
        goodsDesc = po.getGoodsDesc();
        goodsPicker = po.getGoodsPicker();
        pickAddress = po.getPickAddress();
        pickTime = po.getPickTime();
        return this;
    }

}
