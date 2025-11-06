package codeDemo.core_northwind_java.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codeDemo.core_northwind_java.business.abstracts.ProductService;
import codeDemo.core_northwind_java.dataAccess.abstracts.ProductDao;
import codeDemo.core_northwind_java.entities.concretes.Product;


@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}


	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
