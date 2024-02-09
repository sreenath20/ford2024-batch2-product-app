package com.company.product.controller;

import com.company.product.dto.Product;
import com.company.product.exceptions.ProductException;
import com.company.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    //List all API URL
    @PostMapping("product")
    public Product addProduct(@RequestBody Product newProduct){

        Product product=null;
        try {
            product = this.productService.createNewProduct(newProduct);
        } catch (ProductException e) {
            e.printStackTrace();
        }
        return product;
    }

    @GetMapping("product/{id}")
    public Product getProductById(@PathVariable("id") Integer productId ){
        Product product =null;
        try {
            product = this.productService.getProductById(productId);
        } catch (ProductException e) {
            e.printStackTrace();
        }
        return product;
    }



}
