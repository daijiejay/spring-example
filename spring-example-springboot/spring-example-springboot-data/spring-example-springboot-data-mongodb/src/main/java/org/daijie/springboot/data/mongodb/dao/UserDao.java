package org.daijie.springboot.data.mongodb.dao;

import org.daijie.springboot.data.mongodb.entity.User;

/**
 * @author daijie
 * @since 2019/4/15
 */
public interface UserDao {

    void save(User user);

    void remove(Long id);

    void update(User user);

    User findById(Long id);
}
