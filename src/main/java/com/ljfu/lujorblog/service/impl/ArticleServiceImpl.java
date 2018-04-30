package com.ljfu.lujorblog.service.impl;

import com.ljfu.lujorblog.domain.Article;
import com.ljfu.lujorblog.mapper.ArticleMapper;
import com.ljfu.lujorblog.service.ArticleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.30 15:57
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    private static final Logger LOGGER = Logger.getLogger(ArticleServiceImpl.class);

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public void addArticle(Article article) {
        articleMapper.save(article);
    }

    @Override
    public void removeArticle(Integer articleId) {
        articleMapper.deleteByArticleId(articleId);
    }

    @Override
    public Article findArticle(Integer articleId) {
        Article article = articleMapper.selectByArticleId(articleId);
        return article;
    }

    @Override
    public List<Article> findAllArticles() {
        List<Article> articles = articleMapper.selectAllArticle();
        return articles;
    }

    @Override
    public List<Article> findArticlesByTagId(Integer tagId) {
        List<Article> articles = articleMapper.selectArticlesByTagId(tagId);
        return articles;
    }

    @Override
    public List<Article> findArticlesByCategoryId(Integer categoryId) {
        List<Article> articles = articleMapper.selectArticlesByCategoryId(categoryId);
        return articles;
    }

    @Override
    public Article findPreArticle(Integer articleId) {
        Article article = articleMapper.selectPreArticle(articleId);
        return article;
    }

    @Override
    public Article findLatArticle(Integer articleId) {
        Article article = articleMapper.selectLatArticle(articleId);
        return article;
    }

    @Override
    public void modifyArticle(Article article) {
        articleMapper.update(article);
    }
}
