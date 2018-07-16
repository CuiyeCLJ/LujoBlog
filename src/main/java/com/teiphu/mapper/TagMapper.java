package com.teiphu.mapper;

import com.teiphu.domain.Tag;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.21 9:29
 */
public interface TagMapper {

    int insertTag(Tag tag);

    int insertTagIfNecessary(Tag tag);

    int deleteByTagId(Integer tagId);

    Tag selectByTagId(Integer tagId);

    List<Tag> selectAllTag();

    List<Tag> selectTagsByArticleId(Integer articleId);

    int updateTag(Tag tag);

    int updateTagIfNecessary(Tag tag);
}
