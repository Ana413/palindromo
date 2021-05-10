package com.impacta.palindromo.main;

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
		mainClass.validPolindromo("rotator");
	}
	
	@Test
	public void deveRetornarPalindromoFalso() {
		mainClass.validPolindromo("elephant");
	}
	
	@Test
	public void deveRetornarPalavraEmpty() {
		mainClass.validPolindromo("");
	}
}