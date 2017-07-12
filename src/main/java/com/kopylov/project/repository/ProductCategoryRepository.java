package com.kopylov.project.repository;

import com.kopylov.project.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, String> {

    @Query("SELECT new com.kopylov.project.entity.ProductCategory(p.category, p.categoryName) from ProductCategory p")
    List<ProductCategory> findOnlyCategories();
}
