package com.impacta.palindromo.main;

public class MainClass {

	@SuppressWarnings("unused")
	public boolean validPolindromo(String inputWord) {
		
		String invertedWord = new StringBuffer(inputWord).reverse().toString(); 
		
		if(inputWord.equals(invertedWord) && !inputWord.isEmpty()){
			return true;
		}
		
		return false;
	}

}
