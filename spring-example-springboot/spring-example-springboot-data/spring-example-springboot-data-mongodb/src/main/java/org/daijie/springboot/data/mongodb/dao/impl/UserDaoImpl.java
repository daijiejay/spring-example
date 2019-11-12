package org.daijie.springboot.data.mongodb.dao.impl;

import org.daijie.springboot.data.mongodb.dao.UserDao;
import org.daijie.springboot.data.mongodb.entity.User;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.annotation.Resource;

/**
 * @author daijie
 * @since 2019/4/15
 */
public class UserDaoImpl implements UserDao {

    @Resource
    private MongoTemplate mongoTemplate;

    public void save(User user) {
        this.mongoTemplate.save(user);
    }

    public void remove(Long id) {
        this.remove(id);
    }

    public void update(User user) {
        this.update(user);
    }

    public User findById(Long id) {
        return this.findById(id);
    }
}
