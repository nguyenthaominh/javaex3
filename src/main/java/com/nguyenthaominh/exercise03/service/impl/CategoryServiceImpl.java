package com.nguyenthaominh.exercise03.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.nguyenthaominh.exercise03.entity.Category;
import com.nguyenthaominh.exercise03.service.CategoryService;
import com.nguyenthaominh.exercise03.repository.CategoryRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category getCategoryById(String categoryId) {
        Optional<Category> optionalCategory = categoryRepository.findById(categoryId);
        return optionalCategory.orElse(null);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category updateCategory(Category category) {
        Optional<Category> optionalExistingCategory = categoryRepository.findById(category.getCategoryId());
        if (optionalExistingCategory.isPresent()) {
            Category existingCategory = optionalExistingCategory.get();
            existingCategory.setCategoryName(category.getCategoryName());
            existingCategory.setCategoryDescription(category.getCategoryDescription());
            existingCategory.setIcon(category.getIcon());
            existingCategory.setImage(category.getImage());
            existingCategory.setPlaceholder(category.getPlaceholder());
            existingCategory.setActive(category.isActive());
            existingCategory.setUpdatedAt(LocalDateTime.now());
            Category updatedCategory = categoryRepository.save(existingCategory);
            return updatedCategory;
        }

        return null;
    }

    @Override
    public void deleteCategory(String categoryId) {
        categoryRepository.deleteById(categoryId);
    }
}
