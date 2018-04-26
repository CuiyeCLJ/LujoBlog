package com.ljfu.lujorblog.mapper;

import com.ljfu.lujorblog.domain.Comment;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.21 9:29
 */
public interface CommentMapper {

    int insertComment(Comment comment);

    int insertCommentSel(Comment comment);

    int deleteByPrimaryKey(Integer commentId);

    //获取文章的评论
    List<Comment> selectArticleComment(Integer articleId);

//    Comment selectByPrimaryKey(Integer commentId);
    //获取评论的子评论
    List<Comment> selectChildComment(Integer commentId);

    int updateComment(Comment comment);
}
