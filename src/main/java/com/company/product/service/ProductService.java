package com.company.product.service;

import com.company.product.dto.Product;
import com.company.product.exceptions.ProductException;

import java.util.List;

public interface ProductService {
    // add all service contracts here
    Product getProductById(Integer id) throws ProductException;
    Product createNewProduct(Product product)throws ProductException;
    Product updateProduct(Product product)throws ProductException;
    Product deleteProductById(Integer id) throws ProductException;
    List<Product> getAllProducts()throws ProductException;
    List<Product> getAllProductsSortedByPrice()throws ProductException;
}
