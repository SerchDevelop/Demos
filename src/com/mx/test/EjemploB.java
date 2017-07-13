package com.mx.test;

public class EjemploB {

	public static void main(String[] args) {
		
		Integer numeros[] = {0,3,7,2,1,5,12,4,0};
		// Copie en la casilla 1 el numero que esta en la casilla 8
		numeros[1] = numeros[8];
		Integer var = 2;
		do{
			// Sume el numero que esta en la casilla 1 al numero que esta enla casilla 2
			// Y ponga el total en la casilla 1
			numeros[1] = numeros[1] + numeros[var];
			
			// Sume el numero que esta en la casilla 1 al numero que esta enla casilla 3
			// Y ponga el total en la casilla 1 
			var++;
			
			System.out.println("Valor :: " + numeros[1]);

		}
		while(numeros[var] < numeros[7]);
		
		System.out.println("Numero casilla 1 :: " + numeros[1]);

	}

}
