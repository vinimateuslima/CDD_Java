package Heranca;

public class Cavalo extends Mamifero{

	public Cavalo(String nome) {
		super(nome);
	}
	
	public void comer(String tipo) {
		System.out.println("O " + nome + " está comendo " + tipo);
	}
	
	public void locomover(String tipo) {
		System.out.println("O " + nome + " está se locomovendo " + tipo);
	}

}
