package com.ljfu.lujorblog.service;

import com.ljfu.lujorblog.domain.Category;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.30 15:49
 */
public interface CategoryService {

    void addCategory(Category category);

    void removeCategory(Integer categoryId);

    Category findCategory(Integer categoryId);

    List<Category> findAllCategorys();

    void modifyCategory(Category category);
}
