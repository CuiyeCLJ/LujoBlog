package com.teiphu.service.impl;

import com.teiphu.domain.Comment;
import com.teiphu.mapper.CommentMapper;
import com.teiphu.service.CommentService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.30 15:58
 */
@Service
public class CommentServiceImpl implements CommentService {

    private static final Logger LOGGER = Logger.getLogger(CommentServiceImpl.class);

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public void addComment(Comment comment) {
        commentMapper.insertComment(comment);
    }

    @Override
    public void removeComment(Integer commentId) {
        commentMapper.deleteByCommentId(commentId);
    }

    @Override
    public Comment findComment(Integer commentId) {
        Comment comment = commentMapper.selectCommentByCommentId(commentId);
        return comment;
    }

    @Override
    public List<Comment> findAllComments() {
        return null;
    }

    @Override
    public List<Comment> findCommentsByArticleId(Integer articleId) {
        List<Comment> comments = commentMapper.selectCommentByArticleId(articleId);
        return comments;
    }

    @Override
    public List<Comment> findCommentsByCommentPid(Integer commentPid) {
        List<Comment> comments = commentMapper.selectChildComment(commentPid);
        return comments;
    }

    @Override
    public void modifyComment(Comment comment) {
        commentMapper.updateComment(comment);
    }
}
