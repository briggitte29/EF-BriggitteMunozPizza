package com.briggitte.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briggitte.exam.models.Pizza;
import com.briggitte.exam.repository.PizzaRepository;

@Service
public class PizzaServiceImpl implements PizzaService{
	
	@Autowired
	private PizzaRepository repository;


	@Override
	public List<Pizza> listarPizza() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void guardarPizza(Pizza pizza) {
		// TODO Auto-generated method stub
		
		repository.save(pizza);
		
	}

}
