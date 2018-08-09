package com.teiphu.controller;

import com.teiphu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Lifu.Zheng
 * @data 2018.05.01 20:47
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("userEmail") String userEmail,
                        @RequestParam("userPassword") String userPassword) {
        return null;
    }

    @RequestMapping(value = "/logout")
    public String logout() {
        return null;
    }
}
