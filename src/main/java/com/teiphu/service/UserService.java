package com.teiphu.service;

import com.teiphu.domain.User;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.30 14:27
 */
public interface UserService {

//    添加用户
    void addUser(User user);

//    删除用户
    void removeUser(Integer userId);

//    根据Id获取用户
    User findUser(Integer userId);

//    获取所有用户
    List<User> findAllUsers();

    User findUserByName(String userName);

//    修改用户
    void modifyUser(User user);

    void modifyUserIfNecessary(User user);

}
