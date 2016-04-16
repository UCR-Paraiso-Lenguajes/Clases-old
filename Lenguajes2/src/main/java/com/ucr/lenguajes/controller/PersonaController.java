package com.ucr.lenguajes.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.ucr.objectos.Persona;
@Controller
public class PersonaController 
{
	private int id=0;
	private HashMap<String, Persona> personas = new HashMap<String, Persona>();
	
	@RequestMapping(value="/personas", method = RequestMethod.GET)
	public @ResponseBody String helloWorld5() 
	{
		return new Gson().toJson(personas);
	}
	
	@RequestMapping(value="/personas/{id}", method = RequestMethod.GET)
	public @ResponseBody String helloWorld9(@PathVariable String id) 
	{
		return new Gson().toJson(personas.get(id));
	}
	
/*	@RequestMapping(value="/personas/{id}", method = RequestMethod.PUT)
	public @ResponseBody String helloWorld10(@PathVariable String id) 
	{
		return new Gson().toJson(personas.get(id));
	}*/
	
	@RequestMapping(value="/personas/{id}", method = RequestMethod.DELETE)
	public void helloWorld11(@PathVariable String id) 
	{
		personas.remove(id);
	}
	
	@RequestMapping(value="/personas", method = RequestMethod.POST)
	public @ResponseBody String helloWorld4(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		int edad = Integer.parseInt(request.getParameter("edad"));
		String pais = request.getParameter("pais");
		
		Persona p = new Persona(edad, pais);
		p.setId(""+id);
		
		p.setNombre(request.getParameter("nombre"));
		p.setCedula(request.getParameter("cedula"));
		personas.put( p.getId(), p );
		
		id++;
		
		return new Gson().toJson(p);
	}
	
}
