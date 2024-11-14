package Fundamentos;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número de 1 a 7: ");
		
		int resp = entrada.nextInt();
		
		if (resp == 1) {
			System.out.println("Você escolheu o Domingo");
		}
		else if (resp == 2) {
			System.out.println("Você escolheu o Segunda");
		}
		
		else if (resp == 3) {
			System.out.println("Você escolheu o Terça");
		}
		
		else if (resp == 4) {
			System.out.println("Você escolheu o Quarta");
		}
		
		else if (resp == 5) {
			System.out.println("Você escolheu o Quinta");
		}
		
		else if (resp == 6) {
			System.out.println("Você escolheu o Sexta");
		}
		
		else if (resp == 7) {
			System.out.println("Você escolheu o Sábado");
		}
		
		else {
			System.out.println("Valor inválido");
		}
		
	}

}
