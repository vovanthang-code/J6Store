package com.vvt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vvt.entity.Order;

public interface OrderDAO extends JpaRepository<Order, Long>{
	@Query("select o from Order o where o.account.username = ?1")
	List<Order> findByUsername(String username);

}
