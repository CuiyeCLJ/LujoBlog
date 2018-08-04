package com.teiphu;

import com.teiphu.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author TeIphu
 * @data 2018.08.02 21:35
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class ArticleServiceTest {

    @Autowired
    ArticleService articleService;

//    public void addArticle() {
//
//    }
//
//    void removeArticle(Integer articleId);
//
//    //    根据Id获取文章
//    @Test
//    public void findArticle() {
//        Article article = articleService.findArticle(1);
//        if (article.getCategory() == null) {
//            System.out.println("article.category is null");
//        } else {
//            System.out.println("article.category isn't null");
//        }
//        System.out.println(article);
//
//    }
//
//    @Test
//    public void findArticleCopy() {
//        Article article = articleService.findByArticleIdAssociateOtherTables(1);
//        if (article.getCategory() == null) {
//            System.out.println("article.category is null");
//        } else {
//            System.out.println("article.category isn't null");
//            for (Tag tag : article.getTags()) {
//                System.out.println(tag);
//            }
//            System.out.println(article.getCategory());
//        }
//        System.out.println(article);
//    }
//    //    获取所有的文章
//    @Test
//    public void findAllArticles() {
//        List<Article> articles = articleService.findAllArticles();
//        for (Article article : articles) {
//            System.out.println(article);
//        }
//    }
//
//    @Test
//    public void findArticlesByTagId() {
//        List<Article> articles = articleService.findArticlesByTagId(2);
//        for (Article article : articles) {
//            System.out.println(article);
//            if (article.getTags() != null) {
//                System.out.println("tag isn't null");
//                for (Tag tag : article.getTags()) {
//                    System.out.println(tag);
//                }
//                System.out.println(article.getCategory());
//            } else {
//                System.out.println("tag isn't null");
//            }
//        }
//    }
//
//    @Test
//    public void findArticlesByCategoryId() {
//        List<Article> articles = articleService.findArticlesByCategoryId(3);
//        for (Article article : articles) {
//            System.out.println(article);
//            if (article.getTags() != null) {
//                System.out.println("tag isn't null");
//                for (Tag tag : article.getTags()) {
//                    System.out.println(tag);
//                }
//                System.out.println(article.getCategory());
//            } else {
//                System.out.println("tag isn't null");
//            }
//        }
//    }

//    //    获取上一篇文章
//    Article findPreArticle(Integer articleId);
//
//    //    获取下一篇文章
//    Article findLatArticle(Integer articleId);
//
//    @Test
//    public void findArticleByPage() {
//        List<Article> articles = articleService.findArticleByPage(3);
//        for (Article article : articles) {
//            System.out.println(article);
//        }
//    }
//
    /*
    @Test
    public void findArticlesByPageAssociateOtherTables() {
        List<Article> articles = articleService.findArticlesByPageAssociateOtherTables(1);
        System.out.println(articles.size());
        for (Article article : articles) {
            System.out.println(article);
            System.out.println(article.getCategory());
            for (Tag tag : article.getTags()) {
                System.out.println(tag);
            }
        }
    }*/
//
//    void modifyArticle(Article article);
//
    @Test
    public void countArticle() {
        int count = articleService.countArticle();
        System.out.println(count);
    }

//    @Test
//    public void countArticleWithCategory() {
//        int count = articleService.countArticleWithCategory(3);
//        System.out.println(count);
//    }
//
//    Integer countArticleWithTag(Integer tagId);
//
//    //    获取文章评论总数
//    Integer countArticleComment(Integer articleId);

}
