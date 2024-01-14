package com.gustavo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
