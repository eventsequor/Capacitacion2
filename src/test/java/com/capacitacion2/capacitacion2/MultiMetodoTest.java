package com.capacitacion2.capacitacion2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.capacitacion2.capacitacion2.clase6.MultiMetodo;

/*
 * Junit 4
 */
@RunWith(value = Parameterized.class)
public class MultiMetodoTest {
	private MultiMetodo objMetodo;
	private int esperado;
	private int variableA;
	private int variableB;

	/**
	 * Consturctor de la clase
	 * 
	 * @param esperado
	 * @param variableA
	 * @param variableB
	 */
	public MultiMetodoTest(int esperado, int variableA, int variableB) {
		this.esperado = esperado;
		this.variableA = variableA;
		this.variableB = variableB;
	}

	/**
	 * Metodo estático encargado de pasar una lista de valores a Junit en forma de
	 * objeto con el fin de iterar varias veces una prueba
	 * 
	 * @return
	 */
	@Parameters
	public static Iterable datosEntrada() {
		List<Object[]> listaDeValores = new ArrayList<>();
		listaDeValores.add(new Object[] { 2, 10, 5 });// 10/5=2
		listaDeValores.add(new Object[] { 3, 21, 7 });// 21/7=3
		listaDeValores.add(new Object[] { 5, 100, 20 });// 100/20=5
		listaDeValores.add(new Object[] { 0, 100, 0 });// 100/20=5
		return listaDeValores;
	}

	@Before
	public void inicializarPrecondiciones() {
		objMetodo = new MultiMetodo();
	}

	@Test
	public void testGetPalabra() {
		String expected = "Palabra1";
		String resultado = objMetodo.getPalabra("1");// "Palabra1"
		assertEquals(expected, resultado);
	}

	@Test
	public void testGetArregloCaracteres() {
		String palabra = "clase 6";
		char[] arregloEsperado = palabra.toCharArray();
		char[] actual = objMetodo.getArregloCaracteres(palabra);
		assertArrayEquals(arregloEsperado, actual);
	}

	@Test
	public void testGetOpositive() {
		boolean actual = objMetodo.getOpositive(false);
		assertTrue(actual);
	}

	@Test
	public void testMetodoNulo() {
		assertNotNull(objMetodo.metodoNulo());
	}

	@Test(expected = ArithmeticException.class)
	public void testDividir() {
		assertEquals(0, objMetodo.dividir(10, 0));
	}

	@Test
	public void testDividirValoresPositivos() {
		int respueta = objMetodo.dividir(variableA, variableB);
		assertEquals(esperado, respueta);
	}

	@Test(timeout = 4000)
	public void testTimeOut() {
		objMetodo.timeOut();
	}
}
