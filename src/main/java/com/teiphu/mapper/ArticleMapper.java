package com.teiphu.mapper;

import com.teiphu.domain.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.21 9:28
 */
public interface ArticleMapper {

    int save(Article article);

    int insertArticleIfNecessary(Article article);

    int deleteByArticleId(Integer articleId);

//    获取一篇文章
    Article selectByArticleId(Integer articleId);

//    获取所有的文章，不包括文章内容，作为首页的列表
    List<Article> selectAllArticle();

//    List<Article> selectArticleList(HashMap<String, Object> paramMap);

//    获取同一类型的文章
    List<Article> selectArticlesByCategoryId(@Param(value = "categoryId") Integer categoryId);

//    获取同一标签的文章
    List<Article> selectArticlesByTagId(Integer tagId);

    List<Article> selectArticlesByPage(@Param(value = "start") Integer start,
                                       @Param(value = "pageSize") Integer pageSize);

//    获取前一篇文章
    Article selectPreArticle(Integer articleId);

//    获取后一篇文章
    Article selectLatArticle(Integer articleId);

//    通过分页查询文章
    List<Article> selectArticleByPage(@Param(value = "startPos") Integer startPos, @Param(value = "pageSize") Integer pageSize);

    int updateArticle(Article article);

    int updateArticleIfNecessary(Article article);

//    获取总的文章数目
    Integer countArticle();

//    获取同一分类的文章数目
    Integer countArticleByCategoryId(Integer categoryId);

//    获取同一标签的文章数目
    Integer countArticleByTagId(Integer tagId);
}
