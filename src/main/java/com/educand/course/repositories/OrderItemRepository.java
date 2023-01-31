package com.educand.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educand.course.entities.OrderItem;
import com.educand.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
