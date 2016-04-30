package com.ucr.lenguajes.dao;

import javax.sql.DataSource;

import com.ucr.objectos.Persona;

public interface PersonaBD 
{

	public Persona buscar(String id);
	
	public void setDataSource(DataSource dataSource);
}
