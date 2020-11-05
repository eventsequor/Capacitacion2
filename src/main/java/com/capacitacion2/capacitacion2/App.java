package com.capacitacion2.capacitacion2;

import com.capacitacion2.capacitacion2.clase3.AutomatizacionPaginaWeb;
import com.capacitacion2.capacitacion2.clase4.ManagerDriver;
import com.capacitacion2.capacitacion2.clase4.PageObjectoTourFrancia;
import com.capacitacion2.capacitacion2.clase5.AnalizarTexto;
import com.capacitacion2.capacitacion2.clase7.Clase;
import com.capacitacion2.capacitacion2.clase7.Motocicleta;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		Motocicleta moto = new Motocicleta("Yamaha", "rojo", 153, 15);
//		System.out.println("El cilindraje de la moto es " + moto.getCilindraje()+" cc");
//		System.out.println("Se repotencio la motocicleta");
//		moto.setCilindraje(190);
//		System.out.println("El cilindraje de la moto ahora es " + moto.getCilindraje()+" cc");
		
		Motocicleta.metodoImpresion();
		
		
		

//		Clase objClase = new Clase();
//		objClase.metodo();
	}

	public static void espera(int tiempo) {
		try {
			Thread.sleep(tiempo * 1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void clase4() {
		String urlPagina = "https://www.marca.com/ciclismo/tour-francia/clasificacion.html";
		ManagerDriver objManager = new ManagerDriver("google", urlPagina);
		objManager.navegarAPagina();
		PageObjectoTourFrancia objTour = new PageObjectoTourFrancia(objManager.getWebDriver());
		objTour.seleccionListaDesplegable("Etapa 17");
		espera(3);
		objTour.imprimirListaCiclistas();
		espera(5);
		objManager.cerrarNavegador();
	}
}
