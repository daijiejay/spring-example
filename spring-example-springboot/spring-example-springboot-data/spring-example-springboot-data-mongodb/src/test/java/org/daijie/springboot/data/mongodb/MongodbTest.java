package org.daijie.springboot.data.mongodb;

import org.daijie.springboot.data.mongodb.dao.UserDao;
import org.daijie.springboot.data.mongodb.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author daijie
 * @since 2019/4/15
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MongodbStartUp.class)
public class MongodbTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void save() {
        User user = new User();
        user.setUserName("mongotest");
        user.setPassword("password");
        userDao.save(user);
    }

    @Test
    public void update() {
        User user = new User();
        user.setUserName("mongotest");
        user.setPassword("password1");
        userDao.save(user);
    }

    @Test
    public void getUser() {
        userDao.findById(1L);
    }
}
