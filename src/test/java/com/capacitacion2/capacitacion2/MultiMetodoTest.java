package com.capacitacion2.capacitacion2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capacitacion2.capacitacion2.clase6.MultiMetodo;

public class MultiMetodoTest {
	MultiMetodo objMetodo;
	
	@Before
	public void inicializarPrecondiciones() {
		objMetodo = new MultiMetodo();
	}

	@Test
	public void testGetPalabra() {
		String expected = "Palabra1";
		String resultado = objMetodo.getPalabra("1");//"Palabra1"
		assertEquals(expected, resultado);
	}
	
	@Test
	public void testGetArregloCaracteres() {
		String palabra = "clase 6";
		char [] arregloEsperado = palabra.toCharArray();
		char [] actual = objMetodo.getArregloCaracteres(palabra);
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
		assertEquals(0,objMetodo.dividir(10,0));
	}
}
