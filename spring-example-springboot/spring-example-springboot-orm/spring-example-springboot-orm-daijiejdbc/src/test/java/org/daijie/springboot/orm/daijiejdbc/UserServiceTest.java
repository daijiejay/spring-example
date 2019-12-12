package org.daijie.springboot.orm.daijiejdbc;

import org.daijie.springboot.orm.daijiejdbc.model.User;
import org.daijie.springboot.orm.daijiejdbc.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DaijiejdbcStartUp.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void addUser(){
        User user = new User();
        user.setUserName("test");
        user.setPassword("password");
        Assert.assertTrue(userService.addUser(user));
    }

    @Test
    public void getUser(){
        Assert.assertNotNull(userService.getUser(1));
    }
}
