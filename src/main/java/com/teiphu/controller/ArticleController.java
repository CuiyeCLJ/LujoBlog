package com.teiphu.controller;

import com.teiphu.domain.Article;
import com.teiphu.service.ArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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
    @RequestMapping("/")
    public ModelAndView homePage() {
        LOGGER.info("Invoke homePage()");
        ModelAndView modelAndView = new ModelAndView();
        List<Article> articles = articleService.findArticleByPage(1);
        modelAndView.addObject("articleList", articles);
        modelAndView.setViewName("/index");
        return modelAndView;
    }

//    按页号显示
    @RequestMapping("page/{curPage}")
    public @ResponseBody ModelAndView ObtainArticleListByPage(@PathVariable("curPage") Integer curPage) {
        ModelAndView modelAndView = new ModelAndView();
        List<Article> articles = articleService.findArticleByPage(curPage);
        modelAndView.addObject("articleList", articles);
        modelAndView.setViewName("/index");
        return modelAndView;
    }



}
