package com.ou.shiwuzhaoling.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ou.shiwuzhaoling.entity.po.Claim;
import com.ou.shiwuzhaoling.entity.po.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author leo
 */
@Mapper
@Repository
public interface ClaimMapper extends BaseMapper<Claim> {
}
