package com.capacitacion2.capacitacion2;

import com.capacitacion2.capacitacion2.clase3.AutomatizacionPaginaWeb;
import com.capacitacion2.capacitacion2.clase4.ManagerDriver;
import com.capacitacion2.capacitacion2.clase4.PageObjectoTourFrancia;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
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
    
    public static void espera(int tiempo) {
    	try {
			Thread.sleep(tiempo*1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
}
