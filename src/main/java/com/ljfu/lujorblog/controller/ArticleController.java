package com.ljfu.lujorblog.controller;

import com.ljfu.lujorblog.service.ArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    public ModelAndView homePage() {
        ModelAndView modelAndView = new ModelAndView();

    }

}
