package com.ljfu.lujorblog.service.impl;

import com.ljfu.lujorblog.domain.Tag;
import com.ljfu.lujorblog.mapper.TagMapper;
import com.ljfu.lujorblog.service.TagService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.30 15:59
 */
@Service
public class TagServiceImpl implements TagService {

    private static final Logger LOGGER = Logger.getLogger(TagServiceImpl.class);

    @Autowired
    private TagMapper tagMapper;

    @Override
    public void addTag(Tag tag) {
        tagMapper.insertTag(tag);
    }

    @Override
    public void removeTag(Integer tagId) {
        tagMapper.deleteByTagId(tagId);
    }

    @Override
    public Tag findTag(Integer tagId) {
        Tag tag = tagMapper.selectByTagId(tagId);
        return tag;
    }

    @Override
    public List<Tag> findAllTags() {
        List<Tag> tags = tagMapper.selectAllTag();
        return tags;
    }

    @Override
    public void modifyTag(Tag tag) {
        tagMapper.updateTag(tag);
    }
}
