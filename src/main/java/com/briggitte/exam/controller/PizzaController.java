package com.briggitte.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.briggitte.exam.models.Pizza;
import com.briggitte.exam.service.PizzaService;



@Controller
@RequestMapping("/api/v1/pizza")
public class PizzaController {
	
	@Autowired
	private PizzaService service;
	
	
	@GetMapping("/listar")
	public @ResponseBody List<Pizza> listarPizzas(){
		return service.listarPizza();
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarPizza(@RequestBody Pizza pizza) {
		service.guardarPizza(pizza);
	}

}
