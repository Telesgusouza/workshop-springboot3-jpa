package com.gustavo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.course.entities.OrderItem;
import com.gustavo.course.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
