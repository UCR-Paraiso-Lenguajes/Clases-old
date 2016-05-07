package com.ucr.lenguajes.dao.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ucr.lenguajes.dao.PersonaBD;
import com.ucr.objectos.Persona;

public class PersonaDao implements PersonaBD
{
	private JdbcTemplate jdbcTemplate;
	
	public Persona buscar(String id)
	{
		Persona persona = this.jdbcTemplate.queryForObject(
				"select id, nombre, cedula, edad, ciudad from persona where id = ?",
				new Object[]{ id },
				new RowMapper<Persona>() {
					public Persona mapRow(ResultSet rs, int rowNum) throws SQLException {
						Persona persona = new Persona( rs.getInt("edad"), rs.getString("ciudad"));
						persona.setCedula(rs.getString("cedula"));
						persona.setNombre(rs.getString("nombre"));
						return persona;
					}
				});
		
		
		return persona;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void insertar(Persona persona) {
		String sql = "INSERT INTO lenguajes.persona(cedula,nombre,edad,ciudad) VALUES(?,?,?,?,?)";
					 
					
			jdbcTemplate.update(sql, new Object[] { persona.getCedula(),
					persona.getNombre(), persona.getEdad(), persona.getCiudad() 
			});
		
	}
	
	
}
