package com.teiphu.service.impl;

import com.teiphu.domain.Tag;
import com.teiphu.mapper.TagMapper;
import com.teiphu.service.TagService;
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
    public void addTagIfNecessary(Tag tag) {
        tagMapper.insertTagIfNecessary(tag);
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
    public Tag findTagByName(String tagName) {
        Tag tag = tagMapper.selectByTagName(tagName);
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

    @Override
    public void modifyIfNecessary(Tag tag) {
        tagMapper.updateTagIfNecessary(tag);
    }
}
