package org.daijie.springboot.orm.daijiejdbc.service;

import org.daijie.springboot.orm.daijiejdbc.mapper.UserMapper;
import org.daijie.springboot.orm.daijiejdbc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUser(int id){
        return userMapper.selectById(id);
    }

    @Transactional
    public boolean addUser(User user){
        userMapper.insert(user);
        int i = 1/0;
        return userMapper.insert(user);
    }

}
