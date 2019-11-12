package org.daijie.springboot.orm.mybatisplus.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.daijie.springboot.orm.mybatisplus.MybatisPlusStratUp;
import org.daijie.springboot.orm.mybatisplus.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisPlusStratUp.class)
public class UserServiceTest {

    @Autowired
    private IUserService userService;

    @Test
    public void addUser(){
        User user = new User();
        user.setUserName("test");
        user.setPassword("password");
        Assert.assertTrue(userService.save(user));
    }

    @Test
    public void getUser(){
        Assert.assertNotNull(userService.getById(1));
    }

    @Test
    public void getUserPage() {
        QueryWrapper<User> wrapper = new QueryWrapper<User>();
        wrapper.eq("user_id", 1);
        Assert.assertTrue(userService.list(wrapper).size() > 0);
        Page<User> page = new Page(1, 2);
        Assert.assertTrue(userService.getUserPage(page).getSize() == 2);
    }

}
