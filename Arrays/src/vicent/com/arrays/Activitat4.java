package com.vicent.arrays;

import java.util.Random;
import java.util.Scanner;

public class Activitat4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int longuitud = 0;
		boolean semaforo = false;
		System.out.println("Dona'm la longuitud de l'array.");
		while (!semaforo) {

			if (entrada.hasNextInt()) {
				longuitud = entrada.nextInt();
				if ((longuitud <= 20) & (longuitud > 0)) {
					System.out.println("La longuitud es " + longuitud + ".");
					semaforo = true;
				} else {
					System.out.println("La longuitud maxima es 20.");
					entrada.nextLine();
				}
			} else {
				System.out.println("La longuitud ha de ser un integer.");
				entrada.nextLine();
			}
		}
		int[] arrayParells = new int[longuitud];
		System.out.print("L'array Parell: ");
		for (int i = 0; i < arrayParells.length; i++) {
			int numero = new Random().nextInt(0, 100);
			if (numero % 2 == 0) {
				arrayParells[i] = numero;
				System.out.print(arrayParells[i] + " ");
			} else {
				i--;
			}
		}
		int aux = 0;
		for (int i = 0; i < arrayParells.length - 1; i++) {
			for (int j = i + 1; j < arrayParells.length; j++) {

				if (arrayParells[i] > arrayParells[j]) {
					aux = arrayParells[i];
					arrayParells[i] = arrayParells[j];
					arrayParells[j] = aux;
				}
			}
		}
		System.out.println();
		System.out.print("L'array Parell ordenat és: ");
		for (int i = 0; i < arrayParells.length; i++) {
			if (i == 0) {
				System.out.print(arrayParells[i] + " ");
			} else if (i == arrayParells.length - 1) {
				System.out.print(arrayParells[i] + " ");
			} else {
				System.out.print(arrayParells[i] + " ");
			}
		}
		int[] arrayInparells = new int[longuitud];
		System.out.println();
		System.out.print("L'array Inparell: ");
		for (int i = 0; i < arrayInparells.length; i++) {
			int numero = new Random().nextInt(0, 100);
			if (numero % 2 != 0) {
				arrayInparells[i] = numero;
				System.out.print(arrayInparells[i] + " ");
			} else {
				i--;
			}
		}
		aux = 0;
		for (int i = 0; i < arrayInparells.length - 1; i++) {
			for (int j = i + 1; j < arrayInparells.length; j++) {

				if (arrayInparells[i] > arrayInparells[j]) {
					aux = arrayInparells[i];
					arrayInparells[i] = arrayInparells[j];
					arrayInparells[j] = aux;
				}
			}
		}
		System.out.println();
		System.out.print("L'array Inparell ordenat és: ");
		for (int i = 0; i < arrayInparells.length; i++) {
			if (i == 0) {
				System.out.print(arrayInparells[i] + " ");
			} else if (i == arrayInparells.length - 1) {
				System.out.print(arrayInparells[i] + " ");
			} else {
				System.out.print(arrayInparells[i] + " ");
			}
		}
		int longuitudDoble = 0;
		longuitudDoble = longuitud * 2;
		System.out.println();
		System.out.print("L'array Intercalat: ");
		int[] arrayIntercalat = new int[longuitudDoble];
		for (int i = 0, j = 0; i < arrayIntercalat.length; i++) {
			if (i % 2 != 0) {

				arrayIntercalat[i] = arrayInparells[j];
				j++;
			} else {

				arrayIntercalat[i] = arrayParells[j];

			}
			System.out.print(arrayIntercalat[i] + " ");
		}
	}

}
//demanar longitud de la array
//crear array de parells 
//ordenar el array de parells
//crear array de imparells 
//ordenar array de imparells
//crear array del doble de la lnguitud 
// intercalar el array primer en el imparell