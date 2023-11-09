package com.order.api.repository;

import com.order.api.model.entities.OrderItem;
import com.order.api.model.entities.pks.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}