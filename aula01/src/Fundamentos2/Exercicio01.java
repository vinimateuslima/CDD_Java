package Fundamentos2;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos tem na sala?: ");
		int alunos = entrada.nextInt();
		float notas = 0;
		float resultado;
		
		int cont = 1;
		
		while (cont <= alunos) {
			
			System.out.print("Digite a nota do " + cont + "º aluno: " );
			notas = notas + entrada.nextFloat();
			
			
			cont++;
		}
		
		resultado = notas / alunos;
		
		System.out.println("A média das notas é: " + resultado);
		
	}

}