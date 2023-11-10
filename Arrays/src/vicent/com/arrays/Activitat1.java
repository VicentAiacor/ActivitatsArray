package com.vicent.arrays;

import java.util.Random;
import java.util.Scanner;

public class Activitat01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int valor = 0;
		float max = 0;
		float min = 100;

		boolean semaforo = false;

		while (!semaforo) {
			System.out.println("Dona'm un valor: ");
			if (entrada.hasNextInt()) {
				valor = entrada.nextInt();
				if ((valor > 0) && (valor < 1001)) {

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

		float[] arrayReals = new float[valor];

		for (int i = 0; i < arrayReals.length; i++) {
			float numero = new Random().nextFloat(0, 100);
			arrayReals[i] = numero;
			if (numero > max) {
				max = numero;
				
			} else if (numero < min){
				 min = numero ;
			}
		}

		for (int i = 0; i < arrayReals.length; i++) {
			System.out.println("ArrayReals ["+i+"]:"+arrayReals[i]);
		}
		
		System.out.println("Número maxim és: "+max);
		System.out.println("Número minim és: "+min);

		entrada.close();
	}

}
