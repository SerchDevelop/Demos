package com.mx.numero;

public class Aleatorio {

	public static void main(String[] args) {

		for(int a=1; a<=21; a++){
			int valor = (int) Math.floor(Math.random()*100+1);
			System.out.println("Numero :: " + valor);
		}
		

	}

}
