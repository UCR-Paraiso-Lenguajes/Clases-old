package com.ucr.lenguajes.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.ucr.objectos.Persona;

public class PersonaDao 
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
	
	
}
