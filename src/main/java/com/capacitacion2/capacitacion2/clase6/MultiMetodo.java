package com.capacitacion2.capacitacion2.clase6;

public class MultiMetodo {
	
	
	public String getPalabra(String finalPalabra) {
		return "Palabra"+finalPalabra;
	}
	
	public char[] getArregloCaracteres(String palabra) {
		char[] arreglo = new char[palabra.length()];
		for(int i=0;i<palabra.length();i++) {
			arreglo[i]= palabra.charAt(i);
		}
		return arreglo;		
	}
	
	public boolean getOpositive(boolean valor) {
		return !valor;		
	}
	
	public String metodoNulo() {
		return "algun valor";
	}

	public int dividir(int a,int b) {
		return a/b;
	}
}
