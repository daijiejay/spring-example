package org.daijie.springboot.orm.tkmybatis.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.daijie.springboot.orm.tkmybatis.mapper.UserMapper;
import org.daijie.springboot.orm.tkmybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<User> getUsers(){
        return userMapper.selectAll();
    }

    public Page<User> getUserPage(int pageNum, int pageSize) {
        Page page = PageHelper.startPage(pageNum, pageSize);
        userMapper.selectAll();
        return page;
    }

}
