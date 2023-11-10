package com.vicent.arrays;

import java.util.Random;
import java.util.Scanner;

public class Activitat2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int valor = 0;

		boolean semaforo = false;

		while (!semaforo) {
			System.out.println("Dona'm un valor: ");
			if (entrada.hasNextInt()) {
				valor = entrada.nextInt();
				if ((valor > 0) && (valor < 501)) {

					semaforo = true;
				} else {
					System.out.println("Dona'm un valor entre el rang de valors[1-1000].");
					entrada.nextLine();
				}
			} else {
				System.out.println("Dona'm un valor valid.");
				entrada.nextLine();
			}
		}
		char[] arrayLletres = { 'a', 'e', 'i', 'o', 'u' };
		char[] arrayAleatori = new char[valor];

		for (int i = 0; i < arrayAleatori.length; i++) {
			int numero = new Random().nextInt(0, 5);

			arrayAleatori[i] = arrayLletres[numero];

		}
		for (int i = 0; i < arrayAleatori.length; i++) {

			System.out.println(i + ":" + arrayAleatori[i]);
		}
		entrada.close();
	}

}
