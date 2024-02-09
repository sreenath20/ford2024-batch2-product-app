package com.company.product;

import com.company.product.dto.Product;
import com.company.product.exceptions.ProductException;
import com.company.product.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;


// Product getProductById(Integer id) throws ProductException;
//		 Product createNewProduct(Product product)throws ProductException;
//		 Product updateProduct(Product product)throws ProductException;
//		 Product deleteProductById(Integer id) throws ProductException;
//		 List<Product> getAllProducts()throws ProductException;
//		List<Product> getAllProductsSortedByPrice()throws ProductException;
@SpringBootTest
class ProductApplicationTests {

	@Autowired
	private ProductService productService;

	@Test
	void getProductByIdTest() {
		Assertions.fail("To-Do Complete getProductByIdTest");
	}
	@Test
	public void createNewProductTest(){
		//

		Product product=null;
		try {
			product = this.productService.
					createNewProduct(new Product(1,"Mobile",45000.0,
							LocalDate.of(2023,02,25),null));
			Assertions.assertNotNull(product);
		} catch (ProductException e) {
			Assertions.fail(e.getMessage());
		}
	}
	@Test
	public void updateProductTest(){
		Assertions.fail("To-Do Complete updateProductTest");
	}



}
