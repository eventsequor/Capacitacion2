package com.capacitacion2.capacitacion2.clase5;

public class AnalizarTexto {
	private String oracion;
	public String getOracion() {
		return oracion;
	}	
	
	public int determinarNumeroDePalabras() {
		return oracion.trim().split(" ").length;
	}
	
	public int cantidadCaracteres() {
		return oracion.length();		
	}
	
	public void setOracion(String oracion) {
		this.oracion = oracion;
	}

	public AnalizarTexto(String oracion) {
		this.oracion = oracion;
	}

}
