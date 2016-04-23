package com.ucr.lenguajes.controller;

import java.io.IOException;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.ucr.lenguajes.dao.PersonaDao;
import com.ucr.objectos.Persona;
@Controller
public class PersonaController 
{
	private int id=0;
	private HashMap<String, Persona> personas = new HashMap<String, Persona>();
	
	@Autowired
	private PersonaDao personaDao;
	
	@RequestMapping(value="/personas", method = RequestMethod.GET)
	public @ResponseBody String obtenerTodos() 
	{
		return new Gson().toJson( personas );
	}
	
	@RequestMapping(value="/personas/{id}", method = RequestMethod.GET)
	public @ResponseBody String obtener(@PathVariable String id) 
	{
		return new Gson().toJson(personas.get(id));
	}
	
	@RequestMapping(value="/personas/{id}", method = RequestMethod.PUT)
	public @ResponseBody String actualizar(@PathVariable String id, @RequestBody String body) 
	{
		Persona persona = new Gson().fromJson(body, Persona.class);
		
		personas.put(id, persona);
		return new Gson().toJson(persona);
	}
	
	@RequestMapping(value="/personas/{id}", method = RequestMethod.DELETE)
	public void borrar(@PathVariable String id) 
	{
		personas.remove(id);
	}
	
	@RequestMapping(value="/personas", method = RequestMethod.POST)
	public @ResponseBody String crear(@RequestBody String body ) throws IOException
	{
		Persona persona = new Gson().fromJson(body, Persona.class);
		persona.setId(""+id);
			
		personas.put( persona.getId() , persona);
		
		id++;
		
		return new Gson().toJson(persona);
	}
	
	@RequestMapping(value="/personas/sql/{id}", method = RequestMethod.GET)
	public @ResponseBody String obtenerSql(@PathVariable String id) 
	{
		Persona p =personaDao.buscar(id);
		
		return new Gson().toJson(p);
	}
}
