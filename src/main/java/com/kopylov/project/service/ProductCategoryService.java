package com.kopylov.project.service;


import com.kopylov.project.entity.ProductCategory;

import java.util.List;

public interface ProductCategoryService {
    List<ProductCategory> getAllCategories();
    ProductCategory getCategoryById(String id);
}
