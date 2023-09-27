package com.gyjian.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gyjian.test.entity.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper extends BaseMapper<User> {

}
