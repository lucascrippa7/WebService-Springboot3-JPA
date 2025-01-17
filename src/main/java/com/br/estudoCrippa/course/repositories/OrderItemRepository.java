package com.br.estudoCrippa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.estudoCrippa.course.entities.OrderItem;
import com.br.estudoCrippa.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
