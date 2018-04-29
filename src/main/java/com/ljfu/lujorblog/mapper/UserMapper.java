package com.ljfu.lujorblog.mapper;

import com.ljfu.lujorblog.domain.User;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.21 9:28
 */
public interface UserMapper {

    int insertUser(User user);

    int deleteByUserId(Integer userId);

    List<User> selectAllUser();

    User selectByUserId(Integer userId);

    int updateUser(User user);

    int updateByUserIdSelective(User user);
}
