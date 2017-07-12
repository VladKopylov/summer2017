package com.kopylov.project.dto;


import com.kopylov.project.entity.ProductCategory;

public class ProductDTO {

    private String pName;
    private String description;
    private double cost;
    private String brandName;
    private int amount;
    private ProductCategory productCategories;

    public ProductDTO() {
    }

    public ProductDTO(String pName, String description, double cost, String brandName, int amount, ProductCategory productCategories) {
        this.pName = pName;
        this.description = description;
        this.cost = cost;
        this.brandName = brandName;
        this.amount = amount;
        this.productCategories = productCategories;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public ProductCategory getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(ProductCategory productCategories) {
        this.productCategories = productCategories;
    }
}
