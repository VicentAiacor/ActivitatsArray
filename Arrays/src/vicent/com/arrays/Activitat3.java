package tatatatata;

import java.util.Random;
import java.util.Scanner;

public class Activitat3 {

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
		semaforo = false;
		System.out.println("Dona'm una vocal per a fer el recompte de esta");
		String vocal = "";
		int vocalA = 0;
		int vocalE = 0;
		int vocalI = 0;
		int vocalO = 0;
		int vocalU = 0;
		while (!semaforo) {

			if (entrada.hasNext()) {
				vocal = entrada.next();
				switch (vocal) {
				case "a":
					for (int i = 0; i < arrayAleatori.length; i++) {
						if (arrayAleatori[i] == 'a') {
							vocalA++;
						}
					}
					System.out.println("Hi han " + vocalA + " 'a'");
					break;
				case "e":
					for (int i = 0; i < arrayAleatori.length; i++) {
						if (arrayAleatori[i] == 'e') {
							vocalE++;
						}
					}
					System.out.println("Hi han " + vocalE + " 'e'");
					break;
				case "i":
					for (int i = 0; i < arrayAleatori.length; i++) {
						if (arrayAleatori[i] == 'i') {
							vocalI++;
						}
					}
					System.out.println("Hi han " + vocalI + " 'i'");
					break;
				case "o":
					for (int i = 0; i < arrayAleatori.length; i++) {
						if (arrayAleatori[i] == 'o') {
							vocalO++;
						}
					}
					System.out.println("Hi han " + vocalO + " 'o'");
					break;
				case "u":
					for (int i = 0; i < arrayAleatori.length; i++) {
						if (arrayAleatori[i] == 'u') {
							vocalU++;
						}
					}
					System.out.println("Hi han " + vocalU + " 'u'");
					break;
				}

			}

		}

	entrada.close();
	}
}
