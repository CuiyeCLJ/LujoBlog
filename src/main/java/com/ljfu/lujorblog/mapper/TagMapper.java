package com.ljfu.lujorblog.mapper;

import com.ljfu.lujorblog.domain.Tag;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.21 9:29
 */
public interface TagMapper {

    int insertTag(Tag tag);

    int deleteByPrimaryKey(Integer tagId);

    Tag selectByPrimaryKey(Integer tagId);

    List<Tag> selectAllTag();

    List<Tag> getArticleTagList(Integer articleId);

    int updateTag(Tag tag);
}
