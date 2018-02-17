package br.com.iweducation;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

	private Calculadora calculadora = new Calculadora();

	@Test
	public void deveRetornarZeroQuandoEntradaVazia() {

		int resultado = calculadora.soma("");

		Assert.assertEquals(0, resultado);

	}

	@Test
	public void deveSomarEntrada() {

		int resultado = calculadora.soma("2,3,5,8,50");

		// 2+3+5+8+50 = 68
		Assert.assertEquals(68, resultado);

	}

	@Test(expected = IllegalArgumentException.class)
	public void deveGerarExcecaoQuandoNumeroNegativo() {

		calculadora.soma("2,3,5,-8,50");

	}

	@Test
	public void deveSomarSomenteNumeroMenoresQueMil() {

		int resultado = calculadora.soma("2000,2,3,5,5000,8,50,1000");

		// 2+3+5+8+50 = 68
		Assert.assertEquals(68, resultado);

	}

}
