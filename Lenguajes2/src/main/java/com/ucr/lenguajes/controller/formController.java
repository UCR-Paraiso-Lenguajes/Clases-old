package com.ucr.lenguajes.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class formController 
{
	@RequestMapping(value="/form", method = RequestMethod.GET)
	public String helloWorld7() 
	{
		return "form";
	}
	
	@RequestMapping(value="/personaVista", method = RequestMethod.GET)
	public String helloWorld1() 
	{
		return "personaVista";
	}
	
	@RequestMapping(value="/form", method = RequestMethod.POST)
	public void helloWorld(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		PersonaController controller = new PersonaController();
		controller.helloWorld4(request, response);
		response.sendRedirect("personaVista");
	}
	
}
