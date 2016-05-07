package com.ucr.lenguajes.dao.h2;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ucr.lenguajes.dao.PersonaBD;
import com.ucr.objectos.Persona;

public class PersonaDao implements PersonaBD
{
	private JdbcTemplate jdbcTemplate;
	
	public Persona buscar(String id)
	{
		return null;
	}
	
	public void setDataSource(DataSource dataSource) 
	{
	}

	@Override
	public void insertar(Persona persona) 
	{
		return ;
	}
	
	
}
