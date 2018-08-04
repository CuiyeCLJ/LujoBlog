package com.teiphu.service.impl;

import com.teiphu.domain.Category;
import com.teiphu.mapper.ArticleMapper;
import com.teiphu.mapper.CategoryMapper;
import com.teiphu.service.CategoryService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.30 15:58
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    private static final Logger LOGGER = Logger.getLogger(CategoryServiceImpl.class);

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public void addCategory(Category category) {
        categoryMapper.insertCategory(category);
    }

    @Override
    public void addCategoryIfNecessary(Category category) {
        categoryMapper.insertCategoryIfNecessary(category);
    }

    @Override
    public void removeCategory(Integer categoryId) {
        categoryMapper.deleteByCategoryId(categoryId);
    }

    @Override
    public Category findCategory(Integer categoryId) {
        Category category = categoryMapper.selectByCategoryId(categoryId);
        return category;
    }

    @Override
    public Category findCategoryByName(String categoryName) {
        Category category = categoryMapper.selectByCategoryName(categoryName);
        return category;
    }

    @Override
    public List<Category> findAllCategorys() {
        List<Category> categories = categoryMapper.selectAllCategory();
        for (Category category : categories) {
            category.setArticleNum(articleMapper.countArticleByCategoryId(category.getCategoryId()));
        }
        return categories;
    }

    @Override
    public void modifyCategory(Category category) {
        categoryMapper.updateCategory(category);
    }

    @Override
    public void modifyCategoryIfNecessary(Category category) {
        LOGGER.info("invoke CategoryServiceImpl.modifyCategoryIfNecessary()");
        categoryMapper.updateCategoryIfNecessary(category);
    }
}
