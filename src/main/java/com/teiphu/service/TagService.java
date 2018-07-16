package com.teiphu.service;

import com.teiphu.domain.Tag;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.30 15:53
 */
public interface TagService {

//    添加标签
    void addTag(Tag tag);

//    删除标签
    void removeTag(Integer tagId);

//    根据Id获取标签
    Tag findTag(Integer tagId);

//    获取所有的标签
    List<Tag> findAllTags();

//    修改标签
    void modifyTag(Tag tag);

}
