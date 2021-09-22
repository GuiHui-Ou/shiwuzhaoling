package com.ou.shiwuzhaoling.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ou.shiwuzhaoling.entity.po.Manage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author leo
 */
@Mapper
@Repository
public interface ManageMapper extends BaseMapper<Manage> {

}
