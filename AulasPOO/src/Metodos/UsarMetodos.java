package Metodos;

public class UsarMetodos {

	public static void main(String[] args) {
		JavaMetodos j1 = new JavaMetodos();
		
		int anos = j1.idade();
		String nome = j1.nome();
		boolean estado = j1.estado();
		double valor = j1.valor();
		
		System.out.println("A " + nome + " tem " + anos + " anos de idade" + " e o estado é " + estado + " e o valor é: " + valor);
		
		

	}

}
