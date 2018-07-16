package com.teiphu.service;

import com.teiphu.domain.Category;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.30 15:49
 */
public interface CategoryService {

    void addCategory(Category category);

    void addCategoryIfNecessary(Category category);

    void removeCategory(Integer categoryId);

    Category findCategory(Integer categoryId);

    Category findCategoryByName(String CategoryName);

    List<Category> findAllCategorys();

    void modifyCategory(Category category);

    void modifyCategoryIfNecessary(Category category);
}
