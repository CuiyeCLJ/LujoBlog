package com.ljfu.lujorblog.mapper;

import com.ljfu.lujorblog.domain.Tag;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.21 9:29
 */
public interface TagMapper {

    int insertTag(Tag tag);

    int deleteByTagId(Integer tagId);

    Tag selectByTagId(Integer tagId);

    List<Tag> selectAllTag();

    List<Tag> selectTagsByArticleId(Integer articleId);

    int updateTag(Tag tag);
}
