package codeDemo.core_northwind_java.business.abstracts;

import java.util.List;

import codeDemo.core_northwind_java.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}
