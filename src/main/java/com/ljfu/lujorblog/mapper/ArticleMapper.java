package com.ljfu.lujorblog.mapper;

import com.ljfu.lujorblog.domain.Article;

import java.util.HashMap;
import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.21 9:28
 */
public interface ArticleMapper {

    int save(Article article);

    int deleteByPrimaryKey(Integer articleId);

    Article selectByPrimaryKey(Integer articleId);

    List<Article> selectAllArticle();

    List<Article> selectArticleList(HashMap<String, Object> paramMap);

    int update(Article article);
}
