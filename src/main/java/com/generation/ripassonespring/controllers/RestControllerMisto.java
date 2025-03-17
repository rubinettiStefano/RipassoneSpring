package com.generation.ripassonespring.controllers;

import com.generation.ripassonespring.model.Regione;
import com.generation.ripassonespring.repos.RegioneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestControllerMisto
{
	@Autowired
	RegioneRepo rRepo;

	//endpoint -> GET localhost:8080/sommapagina?a=10&b=20
	@GetMapping("/sommapagina")
	public int faiSomma(@RequestParam int a, @RequestParam int b)
	{
		int c= a+b;
		return c;
	}

	@GetMapping("/regioni")
	public List<Regione> tutteRegioni()
	{
		return rRepo.findAll();
	}

//brutto, con i param
//	@PostMapping("/regioni")
//	public void salvaRegione(@RequestParam String nome,@RequestParam String areaGeo)
//	{
//		Regione r = new Regione();
//		r.setNome(nome);
//		r.setAreaGeografica(areaGeo);
//
//		rRepo.save(r);
//	}

	@PostMapping("/regioni")
	public void salvaRegione(@RequestBody Regione r)
	{
		rRepo.save(r);
//		{
//			"nome":"Topolinia",
//			"areaGeografica":"Isola"
//		}
	}
}
