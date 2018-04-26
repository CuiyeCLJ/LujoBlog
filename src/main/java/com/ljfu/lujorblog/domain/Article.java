package com.ljfu.lujorblog.domain;

import javax.validation.constraints.Null;
import java.util.Date;
import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.20 14:53
 */
public class Article {

    private Integer articleId;

    private Integer userId;

    private Integer categoryId;

    private List<Tag> tagList;

    private String articleTitle;

    private String articleSummary;

    private String articleContent;

    private Date articleCreationTime;

    private Date articleUpdateTime;

    private Integer articleStatus;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleSummary() {
        return articleSummary;
    }

    public void setArticleSummary(String articleSummary) {
        this.articleSummary = articleSummary;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Date getArticleCreationTime() {
        return articleCreationTime;
    }

    public void setArticleCreationTime(Date articleCreationTime) {
        this.articleCreationTime = articleCreationTime;
    }

    public Date getArticleUpdateTime() {
        return articleUpdateTime;
    }

    public void setArticleUpdateTime(Date articleUpdateTime) {
        this.articleUpdateTime = articleUpdateTime;
    }

    public Integer getArticleStatus() {
        return articleStatus;
    }

    public void setArticleStatus(Integer articleStatus) {
        this.articleStatus = articleStatus;
    }
}
