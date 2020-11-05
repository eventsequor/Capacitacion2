package com.capacitacion2.capacitacion2.clase7;

public class Motocicleta {
	
	private String marca;
	private String color;
	private int cilindraje;
	private int potencia;
	
	
	public static void metodoImpresion() {
		System.out.println("esto es una impresa");
	}
	
	public Motocicleta(String marca,String color,int cilindraje,int potencia) {
		this.marca = marca;
		this.color = color;
		this.cilindraje = cilindraje;
		this.potencia = potencia;		
	}
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

}
