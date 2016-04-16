package com.ucr.objectos;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonaTest 
{
	@Test
	public void probar()
	{
		Persona p = new Persona(19, "Costa rica");
		Assert.assertEquals(3, p.sumar(1, 2));
	}
	
	
}
