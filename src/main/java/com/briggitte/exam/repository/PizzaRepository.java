package com.briggitte.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.briggitte.exam.models.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer>{

}
