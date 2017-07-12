package com.kopylov.project.service;


import com.kopylov.project.entity.Product;
import com.kopylov.project.entity.ProductCategory;

import java.util.List;

public interface ProductService {

    void addProduct(Product product);
    List<Product> getAllProducts();

}
