package com.ljfu.lujorblog.service;

import com.ljfu.lujorblog.domain.Article;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.30 14:53
 */
public interface ArticleService {

    void addArticle(Article article);

    void removeArticle(Integer articleId);

//    根据Id获取文章
    Article findArticle(Integer articleId);

//    获取所有的文章
    List<Article> findAllArticles();

    List<Article> findArticlesByTagId(Integer tagId);

    List<Article> findArticlesByCategoryId(Integer categoryId);

//    获取上一篇文章
    Article findPreArticle(Integer articleId);

//    获取下一篇文章
    Article findLatArticle(Integer articleId);

    void modifyArticle(Article article);

    Integer countArticle();

    Integer countArticleWithCategory(Integer categoryId);

    Integer countArticleWithTag(Integer tagId);

//    获取文章评论总数
    Integer countArticleComment(Integer articleId);
}
