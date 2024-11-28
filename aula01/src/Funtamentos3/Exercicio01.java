package Funtamentos3;

import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercicio01 {

	public static void main(String[] args) {
		
		String texto = " Este é um texto de exemplo ";
		
		String resultado = texto.trim();
		
		System.out.println(resultado);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um texto: ");
		
		StringTokenizer exemplo = new StringTokenizer(entrada.nextLine());

		
		System.out.println(exemplo.countTokens());
		
		String texto01 = "Será que são iguais?";
		String texto02 = "Será que são iguais?";
		
		boolean isEqual = texto01.equalsIgnoreCase(texto02);
		
		if (isEqual) {
			System.out.println("São iguais");
		} else {
			System.out.println("Não são iguais");
		}
		
		
		
		System.out.print("Digite mais um texto: ");
		texto = entrada.nextLine();
		
		System.out.println(texto.toUpperCase());
		
		String textoFormatado = "";
		
		String[] texto2 = {"a", "vida", "é", "bela"};
		
		for (int i = 0; i < texto2.length; i++) {
			textoFormatado += texto2[i] + " ";
			
		}
		
		System.out.println(textoFormatado.toUpperCase());
		
		String textoFormatadoAoContrario = "";

		
		for (int i = texto2.length-1; i > 0; i--) {
			textoFormatadoAoContrario += texto2[i] + " ";
			
		}
		
		System.out.println(textoFormatadoAoContrario.toUpperCase());
		
		
		
		
		
		
	
	}

}
