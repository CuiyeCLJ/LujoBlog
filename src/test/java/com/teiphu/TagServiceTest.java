package com.teiphu;

import com.teiphu.domain.Tag;
import com.teiphu.service.TagService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author TeIphu
 * @data 2018.07.17 11:53
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class TagServiceTest {

    @Autowired
    TagService tagService;

//    @Test
//    public void findTagByName() {
//        String name = "多线程";
//        Tag tag = tagService.findTagByName(name);
//        System.out.println(tag);
//    }

    @Test
    public void findTagByArticleId() {
        List<Tag> tags = tagService.findTageByArticleId(1);
        for (Tag tag : tags) {
            System.out.println(tag);
        }
    }



//    @Test
//    public void addTag() {
//        Tag tag = new Tag("多线程", "Java多线程相关的高并发", 1);
//        tagService.addTag(tag);
//    }
//
//    public void removeTag() {
//
//    }
//
//    @Test
//    public void findTag() {
//        Tag tag = tagService.findTag(1);
//        System.out.println(tag);
//    }
//
//    @Test
//    public void findTagByName() {
//        String name = "多线程";
//        Tag tag = tagService.findTagByName(name);
//        System.out.println(tag);
//    }
//
//    @Test
//    public void findAllTags() {
//        List<Tag> tags = tagService.findAllTags();
//        for (Tag tag : tags) {
//            System.out.println(tag);
//
//        }
//    }
//
//    @Test
//    public void modifyTag() {
//        Tag tag = new Tag();
//        tag.setTagId(1);
//        tag.setTagDescription("高并发学习");
//        tagService.modifyTag(tag);
//    }
//
//    @Test
//    public void modifyIfNecessary() {
//        Tag tag = new Tag();
//        tag.setTagId(1);
//        tag.setTagDescription("高并发学习");
//        tagService.modifyTag(tag);
//    }

}
