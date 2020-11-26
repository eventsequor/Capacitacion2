package com.capacitacion2.capacitacion2.clase10;

public class Palabras {
	private String palabra;
	
	public Palabras(String palabra) {
		this.palabra = palabra;
	}
	
	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public int longitudPalabra() {
		return palabra.length();
	}
	
	public String concatenar(String complemento) {
		palabra += complemento;
		return palabra;
	}

}
