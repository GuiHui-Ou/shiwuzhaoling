package com.ou.shiwuzhaoling.entity.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ou.shiwuzhaoling.common.BasePageRequest;
import lombok.Data;

/**
 * @author leo
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GoodsRequest extends BasePageRequest {

    private Integer goodsId;

    private String goodsType;

    private Integer goodsStatus;

}
