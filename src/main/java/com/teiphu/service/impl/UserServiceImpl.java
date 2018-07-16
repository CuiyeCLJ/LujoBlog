package com.teiphu.service.impl;

import com.teiphu.domain.User;
import com.teiphu.mapper.UserMapper;
import com.teiphu.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * @author Lifu.Zheng
 * @data 2018.04.30 14:27
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = Logger.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
//        user.setUserRegTime((Timestamp) new Date());
        userMapper.insertUser(user);
    }

    @Override
    public void removeUser(Integer userId) {
        userMapper.deleteByUserId(userId);
    }

    @Override
    public User findUser(Integer userId) {
        User user = userMapper.selectByUserId(userId);
        return user;
    }

    @Override
    public List<User> findAllUsers() {
        LOGGER.info("invoke UserServiceImpl.findAllUsers()");
        List<User> users = userMapper.selectAllUser();
        return users;
    }

    @Override
    public User findUserByName(String userName) {
        LOGGER.info("invoke UserServiceImpl.findUserByName()");
        return userMapper.selectByUserName(userName);
    }

    @Override
    public void modifyUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void modifyUserIfNecessary(User user) {
        userMapper.updateUserIfNecessary(user);
    }
}
