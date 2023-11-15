package vicent.com.arrays;

import java.util.Scanner;

public class Activitat7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador = 0;
		int[] arrayNoms = new int[5];
		int valor = 0;
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
			System.out.println("Valor llegit(" + (i + 1) + "/5):" + arrayNoms[i]);
		}

		if (Math.abs(arrayNoms[0] - arrayNoms[1]) < Math.abs(arrayNoms[0] - arrayNoms[2])
				&& (Math.abs(arrayNoms[0] - arrayNoms[1]) < Math.abs(arrayNoms[0] - arrayNoms[3]))
				&& (Math.abs(arrayNoms[0] - arrayNoms[1]) < Math.abs(arrayNoms[0] - arrayNoms[4]))) {

			System.out.println("El numero que mes s'aproxima a " + arrayNoms[0] + " es: " + arrayNoms[1]);
		} else if (Math.abs(arrayNoms[0] - arrayNoms[2]) < Math.abs(arrayNoms[0] - arrayNoms[1])
				&& (Math.abs(arrayNoms[0] - arrayNoms[2]) < Math.abs(arrayNoms[0] - arrayNoms[3]))
				&& (Math.abs(arrayNoms[0] - arrayNoms[2]) < Math.abs(arrayNoms[0] - arrayNoms[4]))) {
			System.out.println("El numero que mes s'aproxima a " + arrayNoms[0] + " es: " + arrayNoms[2]);
		} else if (Math.abs(arrayNoms[0] - arrayNoms[3]) < Math.abs(arrayNoms[0] - arrayNoms[2])
				&& (Math.abs(arrayNoms[0] - arrayNoms[3]) < Math.abs(arrayNoms[0] - arrayNoms[1]))
				&& (Math.abs(arrayNoms[0] - arrayNoms[3]) < Math.abs(arrayNoms[0] - arrayNoms[4]))) {
			System.out.println("El numero que mes s'aproxima a " + arrayNoms[0] + " es: " + arrayNoms[3]);
		} else if (Math.abs(arrayNoms[0] - arrayNoms[4]) < Math.abs(arrayNoms[0] - arrayNoms[2])
				&& (Math.abs(arrayNoms[0] - arrayNoms[4]) < Math.abs(arrayNoms[0] - arrayNoms[1]))
				&& (Math.abs(arrayNoms[0] - arrayNoms[4]) < Math.abs(arrayNoms[0] - arrayNoms[3]))) {
			System.out.println("El numero que mes s'aproxima a " + arrayNoms[0] + " es: " + arrayNoms[4]);
		}

		entrada.close();
	}

}
