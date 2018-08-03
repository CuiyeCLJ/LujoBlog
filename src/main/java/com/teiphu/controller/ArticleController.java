package com.teiphu.controller;

import com.teiphu.domain.Article;
import com.teiphu.service.ArticleService;
import com.teiphu.util.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
        modelAndView.addObject("articles", articles);
        modelAndView.setViewName("/article_list.jsp");
        return modelAndView;
    }

//    按页号显示
    @RequestMapping("/page/{curPage}")
    public @ResponseBody ModelAndView ObtainArticleListByPage(@PathVariable("curPage") Integer curPage) {
        ModelAndView modelAndView = new ModelAndView();
        List<Article> articles = articleService.findArticleByPage(curPage);
        Page page = Page.getInstance();
        int totalPageNum = page.getTotalPageNum();
        modelAndView.addObject("totalPageNum", totalPageNum);
        modelAndView.addObject("articles", articles);
        modelAndView.setViewName("article_list");
        return modelAndView;
    }

    @RequestMapping(value = "/listAllArticle", method = RequestMethod.GET)
    public String listAllArticle(Model model) {
        LOGGER.info("Invoke ArticleController listAllArticle");
//        List<Article> articles = articleService.findAllArticles();
        List<Article> articles = articleService.findArticleByPage(1);
        Page page = Page.getInstance();
        int totalPageNum = page.getTotalPageNum();
        model.addAttribute("totalPageNum", totalPageNum);
        int curPage = 1;
        model.addAttribute("curPage", curPage);
//        System.out.println(page.getTotalPageNum());
//        System.out.println(articles.size());
        model.addAttribute("articles", articles);
        return "article_list";
    }

    @RequestMapping(value = "/{articleId}", method = RequestMethod.GET)
    public String articleDetail(@PathVariable("articleId") Integer articleId, Model model) {
        LOGGER.info("Invoke ArticleController.articleDetail()");
        Article article = articleService.findArticle(articleId);
        Page page = Page.getInstance();
        Integer totalRecords = page.getTotalRecords();
        model.addAttribute("article", article);
        model.addAttribute("totalRecords", totalRecords);
        return "article_details";
    }

}
