package com.teiphu.mapper;

import com.teiphu.domain.User;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.21 9:28
 */
public interface UserMapper {

    int insertUser(User user);

    int insertUserIfNecessary(User user);

    int deleteByUserId(Integer userId);

    List<User> selectAllUser();

    User selectByUserId(Integer userId);

    User selectByUserName(String userName);

    int updateUser(User user);

    int updateUserIfNecessary(User user);

}
