package com.kopylov.project.service.impl;

import com.kopylov.project.entity.Product;
import com.kopylov.project.entity.ProductCategory;
import com.kopylov.project.repository.ProductRepository;
import com.kopylov.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    @Transactional
    public void addProduct(Product product){
        productRepository.saveAndFlush(product);
    }

    @Transactional
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }


}
