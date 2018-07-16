package com.teiphu.mapper;

import com.teiphu.domain.Comment;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.21 9:29
 */
public interface CommentMapper {

    int insertComment(Comment comment);

    int insertCommentIfNecessary(Comment comment);

    int deleteByCommentId(Integer commentId);

//    获取文章的评论
    List<Comment> selectCommentByArticleId(Integer articleId);

    Comment selectCommentByCommentId(Integer commentId);
//    获取评论的子评论
    List<Comment> selectChildComment(Integer commentId);

    int updateComment(Comment comment);

    int updateCommentIfNecessary(Comment comment);

//    获取文章的评论数
    int countArticleComment(Integer articleId);
}
