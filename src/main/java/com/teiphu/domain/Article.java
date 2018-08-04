package com.teiphu.domain;

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

    private String articleTitle;

    private String articleSummary;

    private String articleContent;

    private Date articleCreationTime;

    private Date articleUpdateTime;

    private Integer articleStatus;

//    private User user;

    private Category category;

    private List<Tag> tags;

//    private List<Comment> comments;

    public Article() {
    }

    public Article(Integer userId, Integer categoryId, String articleTitle, String articleSummary,
                   String articleContent, Date articleCreationTime, Date articleUpdateTime, Integer articleStatus) {
        this.userId = userId;
        this.categoryId = categoryId;
        this.articleTitle = articleTitle;
        this.articleSummary = articleSummary;
        this.articleContent = articleContent;
        this.articleCreationTime = articleCreationTime;
        this.articleUpdateTime = articleUpdateTime;
        this.articleStatus = articleStatus;
    }

    public Article(Integer articleId, Integer userId, Integer categoryId, String articleTitle, String articleSummary,
                   Date articleCreationTime, Date articleUpdateTime, Integer articleStatus) {
        this.articleId = articleId;
        this.userId = userId;
        this.categoryId = categoryId;
        this.articleTitle = articleTitle;
        this.articleSummary = articleSummary;
        this.articleCreationTime = articleCreationTime;
        this.articleUpdateTime = articleUpdateTime;
        this.articleStatus = articleStatus;
    }

    public Article(Integer articleId, Integer userId, Integer categoryId, String articleTitle, String articleSummary,
                   String articleContent, Date articleCreationTime, Date articleUpdateTime, Integer articleStatus) {
        this.articleId = articleId;
        this.userId = userId;
        this.categoryId = categoryId;
        this.articleTitle = articleTitle;
        this.articleSummary = articleSummary;
        this.articleContent = articleContent;
        this.articleCreationTime = articleCreationTime;
        this.articleUpdateTime = articleUpdateTime;
        this.articleStatus = articleStatus;
    }

    public Article(Integer articleId, Integer userId, String articleTitle, String articleSummary, String articleContent,
                   Date articleCreationTime, Date articleUpdateTime, Integer articleStatus, Category category, List<Tag> tags) {
        this.articleId = articleId;
        this.userId = userId;
        this.articleTitle = articleTitle;
        this.articleSummary = articleSummary;
        this.articleContent = articleContent;
        this.articleCreationTime = articleCreationTime;
        this.articleUpdateTime = articleUpdateTime;
        this.articleStatus = articleStatus;
        this.category = category;
        this.tags = tags;
    }

    public Article(Integer articleId, Integer userId, Integer categoryId, String articleTitle,
                   String articleSummary, String articleContent, Date articleCreationTime,
                   Date articleUpdateTime, Integer articleStatus, Category category, List<Tag> tags) {
        this.articleId = articleId;
        this.userId = userId;
        this.categoryId = categoryId;
        this.articleTitle = articleTitle;
        this.articleSummary = articleSummary;
        this.articleContent = articleContent;
        this.articleCreationTime = articleCreationTime;
        this.articleUpdateTime = articleUpdateTime;
        this.articleStatus = articleStatus;
        this.category = category;
        this.tags = tags;
    }

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

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", userId=" + userId +
                ", categoryId=" + categoryId +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleSummary='" + articleSummary + '\'' +
                ", articleContent='" + articleContent + '\'' +
                ", articleCreationTime=" + articleCreationTime +
                ", articleUpdateTime=" + articleUpdateTime +
                ", articleStatus=" + articleStatus +
                '}';
    }
}
