package codeDemo.core_northwind_java.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import codeDemo.core_northwind_java.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{

}
