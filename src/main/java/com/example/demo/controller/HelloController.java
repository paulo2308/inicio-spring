package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String getHello() {
		return "Olá, mundo! Para essa atividade utilizei a orietação aos detalhes e responsabilidade pessoal";
	}
	
	@GetMapping("/2")
	public String getHello2() {
		return "Olá, mundo! A mentalidade e habilidade que quero trabalhar essa semana é a de persistencia e proatividade";
	}
}
