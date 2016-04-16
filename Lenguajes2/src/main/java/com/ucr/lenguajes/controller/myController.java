package com.ucr.lenguajes.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class myController 
{

	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public String helloWorld1() 
	{
		return "hola";
	}
	
	@RequestMapping(value="/welcome1", method = RequestMethod.GET)
	public String helloWorld(HttpServletRequest request)
	{
		String message = "Hola hoy es sabado";
			
		request.setAttribute("message", message);
		
		return "hola";
	}
	
	@RequestMapping(value = "/jstl", method = RequestMethod.GET)
	public String ejemplojstl(HttpServletRequest req) 
	{
		List<String> list  = new ArrayList<String>();
		list.add("List A");
		list.add("List B");
		list.add("List C");
		list.add("List D");
		list.add("List 1");
		list.add("List 2");
		list.add("List 3");

		req.setAttribute("lists", list);

		return "jstl";

	}
}
