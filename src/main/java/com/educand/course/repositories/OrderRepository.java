package com.educand.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educand.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
