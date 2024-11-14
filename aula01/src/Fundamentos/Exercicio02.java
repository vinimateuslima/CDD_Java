package Fundamentos;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		
		double n1 = entrada.nextDouble();
		
		System.out.print("Digite a primeira nota: ");
		
		double n2 = entrada.nextDouble();
		
		double media = (n1 + n2) / 2;
		
		System.out.println("A média das notas é: " + media);

	}

}
