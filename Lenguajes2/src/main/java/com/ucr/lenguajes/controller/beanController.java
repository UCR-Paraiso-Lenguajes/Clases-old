package com.ucr.lenguajes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class beanController 
{

	/*@Autowired
	Persona persona;*/
	/*
	@Autowired
	PersonaConDireccion personaConDireccion;*/
	
	@RequestMapping(value="/persona", method = RequestMethod.GET)
	public String helloWorld1() 
	{
		return "persona";
	}
	
}
