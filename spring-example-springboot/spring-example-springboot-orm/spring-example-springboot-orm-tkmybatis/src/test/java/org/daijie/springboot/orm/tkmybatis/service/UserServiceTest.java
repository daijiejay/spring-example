package org.daijie.springboot.orm.tkmybatis.service;

import org.daijie.springboot.orm.tkmybatis.TkMybatisStratUp;
import org.daijie.springboot.orm.tkmybatis.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TkMybatisStratUp.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void addUser(){
        User user = new User();
        user.setUserName("test");
        user.setPassword("password");
        Assert.assertTrue(userService.addUser(user) == 1);
    }

    @Test
    public void getUser(){
        Assert.assertNotNull(userService.getUser(1));
    }

    @Test
    public void getUsers() {
        Assert.assertFalse(userService.getUsers().isEmpty());
    }

    @Test
    public void getUserPage() {
        Assert.assertFalse(userService.getUserPage(1,1).isEmpty());
    }

}
