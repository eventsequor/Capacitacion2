package com.capacitacion2.capacitacion2.clase8.stepdefinitios;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	private List<Integer> listaNumeros;
	private int ultResultado;

	@Before
	public void antesDe() {
		ultResultado = 0;
	}

	@After
	public void despuesDe() {
		listaNumeros.clear();
		ultResultado = 0;
	}

	@Given("^Dada una lista de números$")
	public void establerLista() {
		System.out.println("Se establece la lista");
		listaNumeros = new ArrayList<>();
	}

	@Given("^El usuario ingresa el número (\\d+)$")
	public void recibirNumero(int numero) throws Throwable {
		System.out.println("Se adiciona a la lista el número " + numero);
		listaNumeros.add(numero);
	}

	@When("^El usuario suma los números ingresados$")
	public void el_usuario_suma_los_números_ingresados() throws Throwable {
		for (Integer numero : listaNumeros) {
			ultResultado += numero;
		}
		System.out.println("El resultado de la sumatoria es: " + ultResultado);
	}

	@Then("^El usuario valida que la sumatoria sea igual a (\\d+)$")
	public void validacionResultado(int arg1) throws Throwable {
		System.out.println("Se hace la validación, valor esperado: " + arg1 + " valor actual " + ultResultado);
		assertEquals(arg1, ultResultado);
	}

	@And("^El usuario envia la palabra \"([^\"]*)\"$")
	public void envioPalabras(String oracion) {
		System.out.println("La oración recibida es: " + oracion);
	}

}
