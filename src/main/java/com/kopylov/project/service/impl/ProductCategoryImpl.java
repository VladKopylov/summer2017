package com.kopylov.project.service.impl;

import com.kopylov.project.entity.Product;
import com.kopylov.project.entity.ProductCategory;
import com.kopylov.project.repository.ProductCategoryRepository;
import com.kopylov.project.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductCategoryImpl implements ProductCategoryService{

    private ProductCategoryRepository productCategoryRepository;

    @Autowired
    public void setProductCategoryRepository(ProductCategoryRepository productCategoryRepository){
        this.productCategoryRepository=productCategoryRepository;
    }

    @Transactional
    public List<ProductCategory> getAllCategories(){
        return productCategoryRepository.findOnlyCategories();
    }

    @Transactional
    public ProductCategory getCategoryById(String id){
        return productCategoryRepository.getOne(id);
    }
}
