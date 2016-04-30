package com.ucr.objectos;

public class PersonaConDireccion extends Persona
{
	public PersonaConDireccion(int edad, String ciudad)
	{
		super(edad, ciudad);
	}

	private String direccion;

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
