package com.ljfu.lujorblog.domain;

/**
 * @author Lifu.Zheng
 * @data 2018.04.20 14:54
 */
public class ArticleToTag {

    private Integer articleToTagId;

    private Integer articleId;

    private Integer tagId;

    public Integer getArticleToTagId() {
        return articleToTagId;
    }

    public void setArticleToTagId(Integer articleToTagId) {
        this.articleToTagId = articleToTagId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }
}
