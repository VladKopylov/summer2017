package com.kopylov.project.entity;


import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "product_category")
public class ProductCategory {

    @Id
    @Column(name="product_category")
    private String category;

    @Column(name = "category_name")
    private String categoryName;

   @OneToMany(mappedBy = "productCategories", cascade = CascadeType.ALL)
    private List<Product> product;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Product> getProduct() {
        return product;
    }

   public void setProduct(List<Product> product) {
        this.product.clear();
        for(Product products: product){
            products.setProductCategories(this);
            this.product.add(products);
        }
        this.product = product;
   }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public ProductCategory() {
    }

    public ProductCategory(String category) {
        this.category = category;
    }

    public ProductCategory(String category, String categoryName) {
        this.category = category;
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "productCategory='" + category + '\'' +
                '}';
    }
}
