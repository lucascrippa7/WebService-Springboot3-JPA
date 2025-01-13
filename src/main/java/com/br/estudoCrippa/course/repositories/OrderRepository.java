package com.br.estudoCrippa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.estudoCrippa.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
