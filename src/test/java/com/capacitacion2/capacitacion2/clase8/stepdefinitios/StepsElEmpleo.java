package com.capacitacion2.capacitacion2.clase8.stepdefinitios;

import com.capacitacion2.capacitacion2.clase4.ManagerDriver;
import com.capacitacion2.capacitacion2.claseFinal.PageObjectBusquedaEmpleo;
import com.capacitacion2.capacitacion2.claseFinal.PageObjectHomeElEmpleo;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepsElEmpleo {
	private ManagerDriver managerDriver;
	private String nombreNavegador;
	private String urlPagina;
	private PageObjectHomeElEmpleo pageObjectHomeElEmpleo;
	private PageObjectBusquedaEmpleo pageObjectBusquedaEmpleo;

	@Given("^El elige el navegador \"([^\"]*)\"$")
	public void el_elige_el_navegador(String arg1) throws Throwable {
		this.nombreNavegador = arg1;
	}

	@Given("^La urlDelNavegador \"([^\"]*)\"$")
	public void la_urlDelNavegador(String arg1) throws Throwable {
		this.urlPagina = arg1;
	}

	@Then("^El usuario lanza el navegador con la pagina$")
	public void lanzarNavegador() throws Throwable {
		managerDriver = new ManagerDriver(nombreNavegador, urlPagina);
		managerDriver.navegarAPagina();
	}

	@Then("^el usuario hace clic en buscar empleo$")
	public void el_usuario_hace_clic_en_buscar_empleo() throws Throwable {
		pageObjectHomeElEmpleo = new PageObjectHomeElEmpleo(managerDriver.getWebDriver());
		pageObjectHomeElEmpleo.darClickBuscarEmpleo();
	}

	@And("^el usuario espera (\\d+) segundos$")
	public void el_usuario_espera_segundos(int timeSleep) throws Throwable {
	    Thread.sleep(timeSleep*1000);
	}
	
	@Then("^el usuario cierra el navegador$")
	public void cierreNavegador() throws Throwable {
		managerDriver.cerrarNavegador();
	}

	@Given("^el usuario busca \"([^\"]*)\"$")
	public void opcion_a_buscar(String opcionBusqueda) throws Throwable {
		pageObjectBusquedaEmpleo = new PageObjectBusquedaEmpleo(managerDriver.getWebDriver());
		pageObjectBusquedaEmpleo.escribirOpcionDeBusqueda(opcionBusqueda);
	}
	
	@Then("^el usuario solicita a la pagina que busque empleos relacionados$")
	public void buscarEmpleo() throws Throwable {
		pageObjectBusquedaEmpleo.enviarPeticion();		
	}
	
	@Then("^el usuario imprime las opciones de busqueda$")
	public void imprimirBusqueda() throws Throwable {
		pageObjectBusquedaEmpleo.imprimirListaResultados();		
	}
	
}
