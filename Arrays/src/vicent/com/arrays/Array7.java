package com.vicent.arrays;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador = 0;
		int[] arrayNoms = new int[5];
		int valor = 0;
		int valorMesProxim = 0;
		System.out.println("Escriu 5 valors enters. Es pot fer en diferents lines.");
		while (contador < 5) {
			if (entrada.hasNextInt()) {
				valor = entrada.nextInt();
				arrayNoms[contador] = valor;
				contador++;
			} else {
				System.out.println("Escriu un nombre enter");
				entrada.next();
			}

		}
		for (int i = 0; i < arrayNoms.length; i++) {
			System.out.println("Valor llegit("+(i+1)+"/5):"+arrayNoms[i]);
		}
		int numeroAbsolut =  Math.abs(valor);
		for (int i = 1; i < arrayNoms.length;i++) {
			valorMesProxim = arrayNoms[0] - arrayNoms[i];
		}
        
        System.out.println("El valor que mes s'arrima a ("+arrayNoms[0]+") és ("+arrayNoms[valorMesProxim]+")");
	}

}
