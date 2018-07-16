package com.teiphu.domain;

import java.util.Date;

/**
 * @author Lifu.Zheng
 * @data 2018.04.20 14:54
 */
public class Comment {

    private Integer commentId;

    private Integer commentPid;

//    private Integer userId;

    private Integer articleId;

    private String commentContent;

    private Date commentCreationTime;

    private Integer commentStatus;

//    private Article article;

    private User user;

//    public Article getArticle() {
//        return article;
//    }
//
//    public void setArticle(Article article) {
//        this.article = article;
//    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getCommentPid() {
        return commentPid;
    }

    public void setCommentPid(Integer commentPid) {
        this.commentPid = commentPid;
    }

//    public Integer getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Integer userId) {
//        this.userId = userId;
//    }
//
    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Date getCommentCreationTime() {
        return commentCreationTime;
    }

    public void setCommentCreationTime(Date commentCreationTime) {
        this.commentCreationTime = commentCreationTime;
    }

    public Integer getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Integer commentStatus) {
        this.commentStatus = commentStatus;
    }
}
