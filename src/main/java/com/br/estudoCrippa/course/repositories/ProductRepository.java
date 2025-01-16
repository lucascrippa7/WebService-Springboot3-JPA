package com.br.estudoCrippa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.estudoCrippa.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
