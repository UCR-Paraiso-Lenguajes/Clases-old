package com.ucr.lenguajes.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.ucr.objectos.Persona;
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
		Persona persona = new Persona(20, "Africa");
		persona.setNombre(request.getParameter("nombre"));
		
		PersonaController controller = new PersonaController();
		controller.crear( new Gson().toJson(persona) );
		response.sendRedirect("personaVista");
	}
	
}
