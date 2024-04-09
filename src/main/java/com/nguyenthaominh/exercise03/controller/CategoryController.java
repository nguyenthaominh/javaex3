package com.nguyenthaominh.exercise03.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.nguyenthaominh.exercise03.entity.Category;
import com.nguyenthaominh.exercise03.service.CategoryService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/categories")
public class CategoryController {

    private CategoryService categoryService;

    // Create Category REST API
    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        Category savedCategory = categoryService.createCategory(category);
        return new ResponseEntity<>(savedCategory, HttpStatus.CREATED);
    }

    // Get Category by id REST API
    // http://localhost:8080/api/categories/{id}
    @GetMapping("{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable("id") String categoryId) {
        Category category = categoryService.getCategoryById(categoryId);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

    // Get All Categories REST API
    // http://localhost:8080/api/categories
    @GetMapping
    public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> categories = categoryService.getAllCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    // Update Category REST API
    @PutMapping("{id}")
    // http://localhost:8080/api/categories/{id}
    public ResponseEntity<Category> updateCategory(@PathVariable("id") String categoryId,
                                                    @RequestBody Category category) {
        category.setCategoryId(categoryId);
        Category updatedCategory = categoryService.updateCategory(category);
        if (updatedCategory != null) {
            return new ResponseEntity<>(updatedCategory, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete Category REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable("id") String categoryId) {
        categoryService.deleteCategory(categoryId);
        return new ResponseEntity<>("Category successfully deleted!", HttpStatus.OK);
    }
}
