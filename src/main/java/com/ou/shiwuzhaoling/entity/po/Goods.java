package com.ou.shiwuzhaoling.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

/**
 * @author leo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Table(name = "goods")
public class Goods{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    @Column(name = "goods_id" )
    private Integer goodsId;

    @Column(name = "goods_name")
    private String goodsName;

    @Column(name = "goods_desc")
    private String goodsDesc;

    @Column(name = "goods_picker")
    private String goodsPicker;

    @Column(name = "pick_address")
    private String pickAddress;

    @Column(name = "pick_time")
    private Date pickTime;

    @Column(name = "goods_type")
    private String goodsType;

    @Column(name = "goods_status")
    private Integer goodsStatus;


    @Column(name = "claim_desc")
    private String claimDesc;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

}
