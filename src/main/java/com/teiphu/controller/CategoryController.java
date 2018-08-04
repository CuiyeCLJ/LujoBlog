package com.teiphu.controller;

import com.teiphu.domain.Article;
import com.teiphu.domain.Category;
import com.teiphu.service.ArticleService;
import com.teiphu.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.05.01 20:46
 */
@Controller
public class CategoryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CategoryController.class);

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/listAllCategory", method = RequestMethod.GET)
    public String listAllCategory(Model model){
        LOGGER.info("Invoke CategoryController.listAllCategory()");
        List<Category> categories = categoryService.findAllCategorys();
        model.addAttribute("categories", categories);
        return "category_list";
    }

    @RequestMapping(value = "/category/{categoryId}", method = RequestMethod.GET)
    public String listSingleCategory(@PathVariable("categoryId") Integer categoryId, Model model) {
        LOGGER.info("Invoke CategoryController.listSingleCategory()");
        Category category = categoryService.findCategory(categoryId);
        List<Article> articles = articleService.findArticlesByCategoryId(categoryId);
        model.addAttribute("articles", articles);
        model.addAttribute("category", category);
        return "single_category_list";
    }
}
