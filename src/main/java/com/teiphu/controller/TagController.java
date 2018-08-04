package com.teiphu.controller;

import com.teiphu.domain.Article;
import com.teiphu.domain.Tag;
import com.teiphu.service.ArticleService;
import com.teiphu.service.TagService;
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
public class TagController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TagController.class);

    @Autowired
    private TagService tagService;

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/listAllTag", method = RequestMethod.GET)
    public String listAllTag(Model model){
        LOGGER.info("Invoke TagController.listAllTag()");
        List<Tag> tags = tagService.findAllTags();
        model.addAttribute("tags", tags);
        return "tag_list";
    }

    @RequestMapping(value = "/tag/{tagId}", method = RequestMethod.GET)
    public String listSingleTag(@PathVariable("tagId") Integer tagId, Model model) {
        LOGGER.info("Invoke TagController.listSingleTag()");
        Tag tag = tagService.findTag(tagId);
        List<Article> articles = articleService.findArticlesByTagId(tagId);
        model.addAttribute("tag", tag);
        model.addAttribute("articles", articles);
        return "single_tag_list";
    }
}
