package Fundamentos;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite M ou F: ");
		char resp = entrada.next().charAt(0);
		
		if (Character.toLowerCase(resp) == 'm') {
			System.out.println("Masculino");
		} else if (Character.toLowerCase(resp) == 'f') {
			System.out.println("Feminino");
		} else {
			System.out.println("Letra inválida");
		}
		
	}

}
