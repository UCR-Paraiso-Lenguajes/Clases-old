package com.ucr.excp;

public class LenguajesExp extends RuntimeException{
private String error;
	public LenguajesExp(String error) {
	this.error =	error;
	}

}
