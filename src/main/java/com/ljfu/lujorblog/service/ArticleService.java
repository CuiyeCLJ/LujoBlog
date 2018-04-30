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

    Article findArticle(Integer articleId);

    List<Article> findAllArticles();

    List<Article> findArticlesByTagId(Integer tagId);

    List<Article> findArticlesByCategoryId(Integer categoryId);

    Article findPreArticle(Integer articleId);

    Article findLatArticle(Integer articleId);

    void modifyArticle(Article article);
}
