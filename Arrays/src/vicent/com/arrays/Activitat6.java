package com.vicent.arrays;

import java.util.Scanner;

public class Activitat6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] arrayEscalar1 = new int[5];
		int[] arrayEscalar2 = new int[5];
		int contador = 1;
		int valor = 0;
		System.out.println("Escriu 5 enters per al primer array.Es pot fer diferents línees.");
		while (contador < 6) {
			if (entrada.hasNextInt()) {
				valor = entrada.nextInt();
				System.out.println("Valor [" + contador + "/5]: " + valor + ".");
				arrayEscalar1[contador - 1] = valor;
				contador++;

			} else {
				System.out.println("El valor introduit ha de ser un integer");
				entrada.next();
			}

		}
		
		for (int i = 0; i < arrayEscalar1.length; i++) {
			System.out.print(arrayEscalar1[i] + " ");
		}
		System.out.println();
		contador = 1;
		System.out.println("Escriu 5 enters per al segon array.Es pot fer diferents línees.");
		while (contador < 6) {
			if (entrada.hasNextInt()) {
				valor = entrada.nextInt();
				System.out.println("Valor [" + contador + "/5]: " + valor + ".");
				arrayEscalar2[contador - 1] = valor;
				contador++;

			} else {
				System.out.println("El valor introduit ha de ser un integer");
				entrada.next();
			}

		}

		for (int i = 0; i < arrayEscalar2.length; i++) {
			System.out.print(arrayEscalar2[i] + " ");
		}
		int resultat = 0;
		int aux = 0;
		for (int i = 0;i < arrayEscalar1.length;i++) {
			aux = arrayEscalar1[i] * arrayEscalar2[i]; 
			resultat += aux;
			
		} 
		System.out.println();
		System.out.println("El resultat es "+resultat+".");
	entrada.close();
	}
}
