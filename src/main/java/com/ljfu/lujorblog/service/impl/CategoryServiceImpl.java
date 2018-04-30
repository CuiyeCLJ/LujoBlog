package com.ljfu.lujorblog.service.impl;

import com.ljfu.lujorblog.domain.Category;
import com.ljfu.lujorblog.mapper.CategoryMapper;
import com.ljfu.lujorblog.service.CategoryService;
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

    @Override
    public void addCategory(Category category) {
        categoryMapper.insertCategory(category);
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
    public List<Category> findAllCategorys() {
        List<Category> categories = categoryMapper.selectAllCategory();
        return categories;
    }

    @Override
    public void modifyCategory(Category category) {
        categoryMapper.updateCategory(category);
    }
}
