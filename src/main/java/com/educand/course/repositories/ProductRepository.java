package com.educand.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educand.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
