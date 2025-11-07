package codeDemo.core_northwind_java.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import codeDemo.core_northwind_java.business.abstracts.ProductService;
import codeDemo.core_northwind_java.core.utilities.results.DataResult;
import codeDemo.core_northwind_java.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	
	@Autowired
	private ProductService productService;
	
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public DataResult<List<Product>> getAll(){
		return this.productService.getAll();		
		
	}

}
