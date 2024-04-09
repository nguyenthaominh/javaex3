package com.nguyenthaominh.exercise03.service;

import java.util.List;
import com.nguyenthaominh.exercise03.entity.Category;

public interface CategoryService {
    Category createCategory(Category category);
    Category getCategoryById(String categoryId);
    List<Category> getAllCategories();
    Category updateCategory(Category category);
    void deleteCategory(String categoryId);
}