package Fundamentos;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int resp;

		int contador = 0;

		System.out.println("Digite 1 para sim e 2 para não");
		
		System.out.print("Telefonou para a vítima?: ");

		resp = entrada.nextInt();

		if (resp == 1) {
			contador++;
		}

		System.out.print("Esteve no local do crime?: ");

		resp = entrada.nextInt();

		if (resp == 1) {
			contador++;
		}

		System.out.print("Mora perto da vítima?: ");

		resp = entrada.nextInt();

		if (resp == 1) {
			contador++;
		}

		System.out.print("Devia para a vítima?: ");

		resp = entrada.nextInt();;

		if (resp == 1) {
			contador++;
		}

		System.out.print("Já trabalhou com a vítima?: ");

		resp = entrada.nextInt();

		if (resp == 1) {
			contador++;
		}
		
		if (contador == 5) {
			System.out.println("Você é assassino(a)!");
		} else if (contador <= 2) {
			System.out.println("Você é suspeito(a)!");
		} else if (contador == 3 || contador == 4){
			System.out.println("Você é cumplice(a)!");
		}

	}

}
