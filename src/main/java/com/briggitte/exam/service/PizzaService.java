package com.briggitte.exam.service;

import java.util.List;

import com.briggitte.exam.models.Pizza;



public interface PizzaService {

	public List<Pizza> listarPizza();
	public void guardarPizza(Pizza pizza);
	
}
