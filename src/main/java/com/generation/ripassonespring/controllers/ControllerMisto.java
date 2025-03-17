package com.generation.ripassonespring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerMisto
{
	//modifica
	//endpoint -> GET localhost:8080/sommapaginaold?a=10&b=20
	@GetMapping("/sommapaginaold")
	public String faiSomma(@RequestParam int a, @RequestParam int b, Model model)
	{
		int c= a+b;
		model.addAttribute("somma",c);
		return "paginaSomma";
	}
}
