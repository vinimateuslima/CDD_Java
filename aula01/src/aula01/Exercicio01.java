package aula01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		
		double resp = entrada.nextDouble();
		
		if (resp > 0)
			System.out.println("Número positivo");
		else
			System.out.println("Número negativo");

	}

}