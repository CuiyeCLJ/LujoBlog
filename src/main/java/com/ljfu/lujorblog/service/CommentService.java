package com.ljfu.lujorblog.service;

import com.ljfu.lujorblog.domain.Comment;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.30 15:42
 */
public interface CommentService {

//    添加评论
    void addComment(Comment comment);

//    删除评论
    void removeComment(Integer commentId);

//    根据评论Id获取评论
    Comment findComment(Integer commentId);

//    获取所有的评论
    List<Comment> findAllComments();

//    根据文章Id获取评论
    List<Comment> findCommentsByArticleId(Integer articleId);

//    获取评论的子评论
    List<Comment> findCommentsByCommentPid(Integer commentPid);

//    修改评论
    void modifyComment(Comment comment);
}
