package com.company.product.service;

import com.company.product.dao.ProductDao;
import com.company.product.dto.Product;
import com.company.product.exceptions.ProductException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer id) throws ProductException {
        // handle exeptions here
        Product foundProduct = this.productDao.GetProductById(id);
        if(foundProduct == null)
            throw new ProductException("Product Id not found : "+id);
        return foundProduct;
    }

    @Override
    public Product createNewProduct(Product newProduct) throws ProductException {

        // handle all exception like 1. product null 2. product already exists

        if(newProduct == null)
            throw new ProductException("Product can't be null");

        Product foundProduct = this.productDao.GetProductById(newProduct.getId());
        if(foundProduct !=null)
            throw new ProductException("Product Already exists:"+newProduct.getName());

        return this.productDao.addProduct(newProduct);
    }

    @Override
    public Product updateProduct(Product product) throws ProductException {

        return null;
    }

    @Override
    public Product deleteProductById(Integer id) throws ProductException {
        return null;
    }

    @Override
    public List<Product> getAllProducts() throws ProductException {
        return null;
    }

    @Override
    public List<Product> getAllProductsSortedByPrice() throws ProductException {
        return null;
    }
}
