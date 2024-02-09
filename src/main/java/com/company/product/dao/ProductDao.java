package com.company.product.dao;

import com.company.product.dto.Product;
import io.swagger.v3.oas.models.security.SecurityScheme;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ProductDao {
    // CRUD
    Product addProduct(Product product);
    Product updateProduct(Product product);
    Product GetProductById(Integer id);
    List<Product> getAllProducts();
    Product deleteProductById(Integer id);
}
