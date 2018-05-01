package com.ljfu.lujorblog.mapper;

import com.ljfu.lujorblog.domain.Category;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.21 9:30
 */
public interface CategoryMapper {

    void insertCategory(Category category);

    void insertCategoryIfNecessary(Category category);

    void deleteByCategoryId(Integer categoryId);

    Category selectByCategoryId(Integer categoryId);

    List<Category> selectAllCategory();

    List<Category> selectCategorysByCategoryPid(Integer categoryPid);

    int updateCategory(Category category);

    int updateCategoryIfNecessary(Category category);



}
