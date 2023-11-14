package com.vicent.arrays;

import java.util.Scanner;

public class Activitat5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador = 1;
		int valor = 0;
		
		System.out.println("Escriu 5 enters.Es pot fer diferents línees.");
		int[] arrayAlReves = new int[5];
		while (contador < 6) {
			if (entrada.hasNextInt()) {
				valor = entrada.nextInt();
				
				System.out.println("Valor ["+contador+"/5]: "+valor+".");
				 arrayAlReves[contador - 1] = valor;
				contador++;
			} else {
				System.out.println("El valor introduit ha de ser un integer");
				entrada.next();
			}
		} 
		System.out.print("L'array en ordre invers es: ");
		for (int i = arrayAlReves.length - 1; i >= 0; i--) {
			
			System.out.print(arrayAlReves[i] + " ");
					
		} entrada.close();
	} 

}
