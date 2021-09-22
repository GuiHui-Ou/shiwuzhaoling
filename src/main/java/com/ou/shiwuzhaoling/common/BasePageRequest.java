package com.ou.shiwuzhaoling.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author leo
 */
@Data
public class BasePageRequest implements Serializable {

    private Integer pageNum;

    private Integer pageSize;

}
