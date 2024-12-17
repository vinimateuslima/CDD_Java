package Acabou;

public class Triatleta implements Corredor, Nadador, Ciclista {

	private String nome;
	private double peso;
	private double altura;

	public Triatleta(String nome, double peso, double altura) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	@Override
	public void aquecer() {
		System.out.println("Estou aquecendo...");

	}

	@Override
	public void pedalar() {

		System.out.println("Estou pedalando...");
	}

	@Override
	public void nadar() {

		System.out.println("Estou nadando...");
	}

	@Override
	public void correr() {
		System.out.println("Estou correndo...");
	}

}
