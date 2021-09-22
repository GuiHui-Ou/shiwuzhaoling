package com.ou.shiwuzhaoling.entity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ou.shiwuzhaoling.entity.po.Goods;
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
public class GoodsDTO {

    private Integer goodsId;

    private String goodsName;

    private String goodsDesc;

    private String goodsPicker;

    private String pickAddress;

    private Date pickTime;

    public Goods toGoodsPO() {
        Goods goods = new Goods();
        goods.setGoodsId(this.goodsId);
        goods.setGoodsName(this.goodsName);
        goods.setGoodsDesc(this.goodsDesc);
        goods.setGoodsPicker(this.goodsPicker);
        goods.setPickAddress(this.pickAddress);
        goods.setPickTime(this.pickTime);
        return goods;
    }

}
