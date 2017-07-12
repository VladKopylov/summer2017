package com.kopylov.project.controller.admin_panel;

import com.kopylov.project.dto.ProductDTO;
import com.kopylov.project.entity.Product;
import com.kopylov.project.entity.ProductCategory;
import com.kopylov.project.exception.StrangeException;
import com.kopylov.project.service.ProductCategoryService;
import com.kopylov.project.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    private ProductService productService;
    private ProductCategoryService productCategoryService;

    @Autowired
    public void setProductService(ProductService productService){
        this.productService = productService;
    }

    @Autowired
    public void setProductCategoryService(ProductCategoryService productCategoryService){ this.productCategoryService = productCategoryService; }

    @RequestMapping(value="admin/products")
    public String getAdminProductPage(Model model){
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "admin/product/products";
    }

    @RequestMapping(value = "/admin/product/add", method = RequestMethod.GET)
    public String getAddingPage(Model model){
        model.addAttribute("productDTO", new ProductDTO());
        List<ProductCategory> categories = productCategoryService.getAllCategories();
        model.addAttribute("categories", categories);
        return "admin/product/adding";
    }

    @RequestMapping(value = "/admin/product/add", method = RequestMethod.POST)
    public String addNewProduct(@ModelAttribute("productDTO") ProductDTO productDTO, Model model, BindingResult res) {

                Product product = new Product(productDTO);
                ProductCategory productCategory =  productCategoryService.getCategoryById(productDTO.getProductCategories().getCategory());
                product.setProductCategories(productCategory);
                this.productService.addProduct(product);
                List<Product> products = productService.getAllProducts();
                model.addAttribute("products", products);

        return "admin/product/products";
    }


}
