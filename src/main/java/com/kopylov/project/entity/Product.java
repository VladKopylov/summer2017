package com.kopylov.project.entity;

import com.kopylov.project.dto.ProductDTO;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    //Name product
    @Column(name = "product_name")
    private String pName;

    //Concise description
    @Column(name="description")
    private String description;

    //Product cost
    @Column(name="cost")
    private double cost;

    //Product brand name
    @Column(name="brand_name")
    private String brandName;

    //Total amount of product
    @Column(name = "amount")
    private int amount;

    //Foreign key - product category
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = ProductCategory.class, optional = false)
    @JoinColumn(name = "product_category")
    @NotFound(action = NotFoundAction.IGNORE)
    private ProductCategory productCategories;

    public Product() {
    }

    public Product(ProductDTO productDTO) {
        this.pName = productDTO.getpName();
        this.description = productDTO.getDescription();
        this.cost = productDTO.getCost();
        this.brandName = productDTO.getBrandName();
        this.amount = productDTO.getAmount();
        this.productCategories = productDTO.getProductCategories();
    }

    public Product(String pName, String description, double cost, String brandName, int amount, ProductCategory productCategories) {
        this.pName = pName;
        this.description = description;
        this.cost = cost;
        this.brandName = brandName;
        this.amount = amount;
        this.productCategories = productCategories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", pName='" + pName + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                ", brandName='" + brandName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
