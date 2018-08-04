package com.teiphu;

import com.teiphu.domain.Category;
import com.teiphu.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author TeIphu
 * @data 2018.07.16 16:15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class CategoryServiceTest {

    @Autowired
    CategoryService categoryService;

    @Test
    public void findCategoryByName() {
        Category category = categoryService.findCategoryByName("Java");
        System.out.println(category);
    }


//    @Test
//    public void addCategory() {
//        Category category = new Category();
//        category.setCategoryName("Java");
//        category.setCategoryDescription("Java相关知识点");
//        categoryService.addCategory(category);
//    }
//
//    @Test
//    public void addCategoryIfNecessary() {
////        Category category = new Category("C语言", "C语言相关知识点");
////        categoryService.addCategoryIfNecessary(category);
//        Category category = new Category("C#", "C#相关基础知识");
//        categoryService.addCategoryIfNecessary(category);
//    }
//
//    @Test
//    public void removeCategory() {
//        categoryService.removeCategory(3);
//    }
//
//    @Test
//    public void findCategory() {
////        Category category = categoryService.findCategory()
//    }
//
//
//    @Test
//    public void findAllCategorys() {
//        List<Category> categories = categoryService.findAllCategorys();
//        for (Category category : categories) {
//            System.out.println(category);
//            System.out.println(category.getArticleNum());
//        }
//    }
//
//    @Test
//    public void modifyCategory() {
//
//    }
//
//    @Test
//    public void modifyCategoryIfNecessary() {
//        Category category = categoryService.findCategoryByName("Java");
//        System.out.println(category);
//        Category newCategory = new Category();
//        newCategory.setCategoryId(category.getCategoryId());
//        newCategory.setCategoryDescription("Java相关基础知识");
//        categoryService.modifyCategoryIfNecessary(newCategory);
//        Category category1 = categoryService.findCategoryByName("Java");
//        System.out.println(category);
//    }

}






