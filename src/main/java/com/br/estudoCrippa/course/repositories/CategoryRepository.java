package com.br.estudoCrippa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.estudoCrippa.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
