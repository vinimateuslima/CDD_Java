package Fundamentos2;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o número de alunos: ");
		
		float notas = 0, media = 0;
		
		int qAlunos = entrada.nextInt();
				
		for (int i = 1; i <= qAlunos ; i++) {
			
			System.out.print("Digite a nota do " + i + "º aluno: ");
			notas += notas = entrada.nextFloat();
			
			
		}
		
		media = notas / qAlunos;
		
		System.out.println(media);

	}

}
