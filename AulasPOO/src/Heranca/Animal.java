package Heranca;

public abstract class Animal {

	String nome;
	
	

	public Animal(String nome) {
		this.nome = nome;
	}

	public void comer() {
		System.out.println("Foi comer");
	}

	public void locomover() {
		System.out.println("Foi...");
	}

}
