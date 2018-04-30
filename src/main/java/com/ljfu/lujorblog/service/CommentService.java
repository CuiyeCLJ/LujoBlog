package com.ljfu.lujorblog.service;

import com.ljfu.lujorblog.domain.Comment;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.30 15:42
 */
public interface CommentService {

    void addComment(Comment comment);

    void removeComment(Integer commentId);

    Comment findComment(Integer commentId);

    List<Comment> findAllComments();

    List<Comment> findCommentsByArticleId(Integer articleId);

    List<Comment> findCommentsByCommentPid(Integer commentPid);

    void modifyComment(Comment comment);
}
