package org.daijie.springboot.orm.daijiejdbc.service;

import org.daijie.springboot.orm.daijiejdbc.mapper.UserMapper;
import org.daijie.springboot.orm.daijiejdbc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUser(int id){
        return userMapper.selectById(id);
    }

    public boolean addUser(User user){
        return userMapper.insert(user);
    }

}
