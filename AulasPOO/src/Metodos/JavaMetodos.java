package Metodos;

import java.util.Scanner;

public class JavaMetodos {
	
	Scanner sc = new Scanner(System.in);
	
	int idade() {
		System.out.print("Digite a idade: ");
		int idade = sc.nextInt();
		return idade;
	}
	
	String nome() {
		System.out.print("Digite o nome: ");
		String nome = sc.nextLine();
		return nome;
	}
	
	
	double valor() {
		System.out.print("Digite o valor: ");
		double valor = sc.nextDouble();
		return valor;
	}
	
	
	boolean estado() {
		return true;
	}

}
