package com.ljfu.lujorblog.controller;

import com.ljfu.lujorblog.service.ArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Lifu.Zheng
 * @data 2018.05.01 20:46
 */
@Controller

public class ArticleController {

    @Autowired
    private ArticleService articleService;

    private static final Logger LOGGER = LoggerFactory.getLogger(ArticleController.class);

//    首页显示
//    @RequestMapping("/")
//    public ModelAndView homePage() {
//        LOGGER.info("Invoke homePage()");
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("/index");
//        return modelAndView;
//    }

//    @RequestMapping("/")
//    public String homePage() {
//        LOGGER.info("Invoke homePage()");
//        return "/index";
//    }

}
