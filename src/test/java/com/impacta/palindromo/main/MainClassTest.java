package com.impacta.palindromo.main;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MainClassTest {
	
	@InjectMocks
    private MainClass mainClass;
	
	
	@Test
	public void deveRetornarPalindromoVerdadeiro() {
		boolean retorno = mainClass.validPolindromo("rotator");
		
		assertEquals(true, retorno);
	}
	
	@Test
	public void deveRetornarPalindromoFalso() {
		boolean retorno = mainClass.validPolindromo("elephant");
		assertEquals(false, retorno);
	}
	
	@Test
	public void deveRetornarPalavraEmpty() {
		boolean retorno = mainClass.validPolindromo("");
		assertEquals(false, retorno);
	}
}