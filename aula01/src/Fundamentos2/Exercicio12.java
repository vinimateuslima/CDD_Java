package Fundamentos2;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		int[] arrayUm = new int[4];
		int[] arrayDois = new int[4];

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < arrayUm.length; i++) {
			System.out.print("Digite o número do primeiro array: ");

			arrayUm[i] = entrada.nextInt();

		}

		for (int i = 0; i < arrayDois.length; i++) {
			System.out.print("Digite o número do segundo array: ");

			arrayDois[i] = entrada.nextInt();

		}

		for (int j : arrayUm) {
			System.out.print(j + " ");
		}
		
		for (int j : arrayDois) {
			System.out.print(j + " ");
		}

	}

}