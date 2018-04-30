package com.ljfu.lujorblog.service;

import com.ljfu.lujorblog.domain.Tag;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.30 15:53
 */
public interface TagService {

    void addTag(Tag tag);

    void removeTag(Integer tagId);

    Tag findTag(Integer tagId);

    List<Tag> findAllTags();

    void modifyTag(Tag tag);

}
