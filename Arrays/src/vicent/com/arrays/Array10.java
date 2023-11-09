package vicent.com.arrays;

import java.util.Scanner;

public class Array10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String[] arrayFrase = new String[2];
		boolean semafor = false;
		String frase1 = "";
		String frase2 = "";
		System.out.println("Escriu la primera frase de la longuitut mínima 5 caràcters:");
		while (!semafor) {
			frase1 = entrada.nextLine().trim();
			if (frase1.length() >= 5) {
				System.out.println("Frase 1: " + frase1);
				arrayFrase[0] = frase1;
				semafor = true;

			} else {
				System.out.println("La frase ha de tindre almeys 5 caràrcters");
			}
		}
		System.out.println("Escriu la segona frase de la longuitut mínima 5 caràcters:");
		semafor = false;
		while (!semafor) {
			frase2 = entrada.nextLine().trim();
			if (frase2.length() > 5) {
				System.out.println("Frase 2: " + frase2);
				arrayFrase[1] = frase1;
				semafor = true;
			} else {
				System.out.println("La frase ha de tindre almeys 5 caràrcters");
			}
		}

		if (frase1.length() > frase2.length()) {
			for (int i = 0; i < frase1.length(); i++) {
				System.out.print(frase1.charAt(i));
				System.out.print(" ");
			}
			System.out.println();
			for (int i = 0; i < frase1.length(); i++) {
				if (i < frase2.length()) {
					System.out.print(frase2.charAt(i));
				} else {
					System.out.print("*");
				}
				System.out.print(" ");
			}
		}
		
		
		if (frase2.length() > frase1.length()) {
			for (int i = 0; i < frase2.length(); i++) {
				if (i < frase1.length()) {
					System.out.print(frase1.charAt(i));
				} else {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
			for (int i = 0; i < frase2.length(); i++) {
				System.out.print(frase2.charAt(i));
				System.out.print(" ");
			}
		}
		if (frase1.length() == frase2.length()) {
			for (int i = 0; i < frase1.length(); i++) {
				System.out.print(frase1.charAt(i));
				System.out.print(" ");
			}
			System.out.println();
			for (int i = 0; i < frase2.length(); i++) {
				System.out.print(frase2.charAt(i));
				System.out.print(" ");
			}
			
		}

		entrada.close();
	}

}