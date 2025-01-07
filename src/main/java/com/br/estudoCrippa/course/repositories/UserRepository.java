package com.br.estudoCrippa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.estudoCrippa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
