package com.ou.shiwuzhaoling.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ou.shiwuzhaoling.entity.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author leo
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
}
