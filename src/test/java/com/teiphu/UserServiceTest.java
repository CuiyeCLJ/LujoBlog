package com.teiphu;

import com.teiphu.domain.User;
import com.teiphu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author TeIphu
 * @data 2018.07.16 12:08
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void findUserByName() {
        User user = userService.findUserByName("Qiuju");
        System.out.println(user);
    }
    /*
    @Test
    public void addUser() {
        Timestamp date = new Timestamp(System.currentTimeMillis());
        User user = new User("Qiuju", "ju", "1017",
                "0", "1501198674@qq.com", null, date);
        userService.addUser(user);
    }

    @Test
    public void findAllUsers() {
        List<User> users = userService.findAllUsers();
        System.out.println(users);
    }

    @Test
    public void findUser() {
        User user = userService.findUser(1);
        System.out.println(user);
    }

    @Test
    public void findUserByName() {
        User user = userService.findUserByName("Qiuju");
        System.out.println(user);
    }

    @Test
    public void modifyUserIfNecessary() {
        User user = new User();
        user.setUserId(5L);
        user.setUserEmail("1543981755@qq.com");
        userService.modifyUserIfNecessary(user);
    }
    */
}
