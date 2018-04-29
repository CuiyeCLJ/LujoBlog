package com.ljfu.lujorblog.mapper;

import com.ljfu.lujorblog.domain.Category;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.21 9:30
 */
public interface CategoryMapper {

    void insertCategory(Category category);

    void deleteByCategoryId(Integer categoryId);

    List<Category> selectAllCategory();

    Category selectByCategoryId(Integer categoryId);

    int updateCategory(Category category);

    int updateCategorySelective(Category category);

}
