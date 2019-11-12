package org.daijie.springboot.orm.mybatis.service;

import org.daijie.springboot.orm.mybatis.mapper.UserMapper;
import org.daijie.springboot.orm.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUser(int id){
        return userMapper.selectByPrimaryKey(id);
    }

    public int addUser(User user){
        return userMapper.insert(user);
    }

}
