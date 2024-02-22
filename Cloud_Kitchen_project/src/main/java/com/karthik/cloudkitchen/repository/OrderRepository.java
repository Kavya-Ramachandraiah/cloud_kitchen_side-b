package com.karthik.cloudkitchen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.karthik.cloudkitchen.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // You can add custom query methods if needed
}
