package org.daijie.springboot.orm.tkmybatis.mapper;

import org.daijie.springboot.orm.tkmybatis.model.User;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UserMapper extends Mapper<User>, ConditionMapper<User>, MySqlMapper<User> {
}