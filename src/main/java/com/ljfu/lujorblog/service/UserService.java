package com.ljfu.lujorblog.service;

import com.ljfu.lujorblog.domain.User;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.30 14:27
 */
public interface UserService {

    void addUser(User user);

    void removeUser(Integer userId);

    User findUser(Integer userId);

    List<User> findAllUsers();

    void modifyUser(User user);

}
