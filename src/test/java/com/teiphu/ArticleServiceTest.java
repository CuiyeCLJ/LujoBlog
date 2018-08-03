package com.teiphu;

import com.teiphu.domain.Article;
import com.teiphu.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author TeIphu
 * @data 2018.08.02 21:35
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class ArticleServiceTest {

    @Autowired
    ArticleService articleService;

    public void addArticle() {

    }
//
//    void removeArticle(Integer articleId);
//
//    //    根据Id获取文章
//    Article findArticle(Integer articleId);
//
//    //    获取所有的文章
    @Test
    public void findAllArticles() {
        List<Article> articles = articleService.findAllArticles();
        for (Article article : articles) {
            System.out.println(article);
        }
    }
//
//    List<Article> findArticlesByTagId(Integer tagId)
//
    @Test
    public void findArticlesByCategoryId() {
        List<Article> articles = articleService.findArticlesByCategoryId(3);
        for (Article article : articles) {
            System.out.println(article);
        }
    }

//    //    获取上一篇文章
//    Article findPreArticle(Integer articleId);
//
//    //    获取下一篇文章
//    Article findLatArticle(Integer articleId);
//
    @Test
    public void findArticleByPage() {
        List<Article> articles = articleService.findArticleByPage(3);
        for (Article article : articles) {
            System.out.println(article);
        }
    }
//
//    void modifyArticle(Article article);
//
    @Test
    public void countArticle() {
        int count = articleService.countArticle();
        System.out.println(count);
    }

    @Test
    public void countArticleWithCategory() {
        int count = articleService.countArticleWithCategory(3);
        System.out.println(count);
    }
//
//    Integer countArticleWithTag(Integer tagId);
//
//    //    获取文章评论总数
//    Integer countArticleComment(Integer articleId);

}
