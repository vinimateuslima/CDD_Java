package javaPOO;

import java.util.Scanner;

public class Pessoa {
	
	String nome;
	Double peso;
	int idade;
	
	Scanner entrada = new Scanner(System.in);
	
	public void cadastro() {
		System.out.print("Digite o nome da pessoa:");
		this.nome = entrada.nextLine();
		System.out.print("Digite a idade: ");
		this.idade = entrada.nextInt();
		System.out.print("Digite o peso: ");
		this.peso = entrada.nextDouble();
	}
	
	public void comer() {
		System.out.println(this.nome + " Foi comer...");
	}
	
	
	

}
