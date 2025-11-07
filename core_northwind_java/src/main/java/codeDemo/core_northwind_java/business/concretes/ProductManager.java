package codeDemo.core_northwind_java.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codeDemo.core_northwind_java.business.abstracts.ProductService;
import codeDemo.core_northwind_java.core.utilities.results.DataResult;
import codeDemo.core_northwind_java.core.utilities.results.Result;
import codeDemo.core_northwind_java.core.utilities.results.SuccessDataResult;
import codeDemo.core_northwind_java.core.utilities.results.SuccessResult;
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
	public DataResult<List<Product>> getAll() {
		
		return new SuccessDataResult<List<Product>>
		(this.productDao.findAll(),"Data has been listed");
				
				
	}


	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Product has been added");
	}

}
