package com.vvt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vvt.entity.Product;

public interface ProductDAO extends JpaRepository<Product, Integer>{
	@Query("select p from Product p where p.category.id=?1")
	List<Product> findByCategoryId(String cid);

}
