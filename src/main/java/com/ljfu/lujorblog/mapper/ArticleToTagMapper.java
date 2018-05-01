package com.ljfu.lujorblog.mapper;

import com.ljfu.lujorblog.domain.Article;
import com.ljfu.lujorblog.domain.ArticleToTag;
import com.ljfu.lujorblog.domain.Tag;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.27 15:49
 */
public interface ArticleToTagMapper {


    int insertArticleTag(ArticleToTag articleToTag);

    void deleteArticleTagByArticleId(Integer articleId);

    void deleteArticleTagByTagId(Integer tagId);

}
