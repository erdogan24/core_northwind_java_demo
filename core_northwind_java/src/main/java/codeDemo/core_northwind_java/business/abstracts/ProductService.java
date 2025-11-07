package codeDemo.core_northwind_java.business.abstracts;

import java.util.List;

import codeDemo.core_northwind_java.core.utilities.results.DataResult;
import codeDemo.core_northwind_java.core.utilities.results.Result;
import codeDemo.core_northwind_java.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	Result add(Product product);
	
	DataResult<Product> getByProductName(String productName);
	
	DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);
	
	DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);
	
	DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);
	
	DataResult<List<Product>> getByProductNameContains(String ProductName);
	
	DataResult<List<Product>> getByProductNameStartsWith(String ProductName);
	
	DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
}
