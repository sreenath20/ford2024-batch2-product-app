package com.company.product.dao;


import com.company.product.dto.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Component
@Repository
public class ProductDaoImpl implements ProductDao{

    private Map<Integer, Product> productMap = new HashMap<>();

    @Override
    public Product addProduct(Product product) {
        this.productMap.put(product.getId(),product);
        return this.productMap.get(product.getId());
    }

    @Override
    public Product updateProduct(Product product) {
        return this.productMap.replace(product.getId(),product);
    }

    @Override
    public Product GetProductById(Integer id) {
        return this.productMap.get(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return (List<Product>) this.productMap.values();
    }

    @Override
    public Product deleteProductById(Integer id) {
        return this.productMap.remove(id);
    }
}
