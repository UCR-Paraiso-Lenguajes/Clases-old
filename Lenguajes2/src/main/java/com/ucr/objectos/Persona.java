package com.ucr.objectos;

import com.ucr.excp.LenguajesExp;

public class Persona 
{
	private Persona persona;
	private String id;
	private String nombre;
	private String cedula;
	private int edad;
	private String ciudad;
	
	public Persona(int edad, String ciudad)
	{
		if( edad < 18 )
		{
			throw new LenguajesExp("La persona debe ser mayor a 18 años.");
		}
		else if( ! ciudad.equalsIgnoreCase("Costa Rica") )
		{
			throw new LenguajesExp("La persona debe vivir en Costa Rica.");
		}
		
		this.edad = edad;
		this.ciudad = ciudad;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public int sumar(int a, int b)
	{
		return a+b;
	}
	
	public int comprar()
	{
		//todo logica
		return 0;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Persona [persona=" + persona + ", id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", edad="
				+ edad + ", ciudad=" + ciudad + ", getId()=" + getId() + ", getNombre()=" + getNombre()
				+ ", getCedula()=" + getCedula() + ", getPersona()=" + getPersona() + ", comprar()=" + comprar()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
