package com.teiphu.mapper;

import com.teiphu.domain.ArticleToTag;

/**
 * @author Lifu.Zheng
 * @data 2018.04.27 15:49
 */
public interface ArticleToTagMapper {


    int insertArticleTag(ArticleToTag articleToTag);

    void deleteArticleTagByArticleId(Integer articleId);

    void deleteArticleTagByTagId(Integer tagId);

}
