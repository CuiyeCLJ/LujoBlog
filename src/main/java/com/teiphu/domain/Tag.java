package com.teiphu.domain;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.20 14:54
 */
public class Tag {

    private Integer tagId;

    private String tagName;

    private String tagDescription;

    private Integer tagStatus;

    private List<Article> articles;

    public Tag() {

    }

    public Tag(String tagName, String tagDescription) {
        this.tagName = tagName;
        this.tagDescription = tagDescription;
    }

    public Tag(String tagName, String tagDescription, Integer tagStatus) {
        this.tagName = tagName;
        this.tagDescription = tagDescription;
        this.tagStatus = tagStatus;
    }

    public Tag(Integer tagId, String tagName, String tagDescription, Integer tagStatus) {
        this.tagId = tagId;
        this.tagName = tagName;
        this.tagDescription = tagDescription;
        this.tagStatus = tagStatus;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagDescription() {
        return tagDescription;
    }

    public void setTagDescription(String tagDescription) {
        this.tagDescription = tagDescription;
    }

    public Integer getTagStatus() {
        return tagStatus;
    }

    public void setTagStatus(Integer tagStatus) {
        this.tagStatus = tagStatus;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "tagId=" + tagId +
                ", tagName='" + tagName + '\'' +
                ", tagDescription='" + tagDescription + '\'' +
                ", tagStatus=" + tagStatus +
                '}';
    }
}
