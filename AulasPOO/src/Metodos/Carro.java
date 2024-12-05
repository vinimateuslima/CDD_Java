package Metodos;

public class Carro {

	public String cor;
	public String modelo;
	public double preco;
	public boolean estaLigado = false;

	public Carro() {

	}

	public Carro(String c) {

		this.cor = c;

	}

	public Carro(String c, String m, double p) {

		this.cor = c;
		this.modelo = m;
		this.preco = p;

	}

	public void ligar() {
		if (estaLigado) {
			System.out.println("O Carro ja está ligado!");
		} else {
			System.out.println("Carro ligado...");
			this.estaLigado = true;
		}

	}

	public void desligar() {
		
		if (estaLigado) {
			System.out.println("Carro desligado!");
			this.estaLigado = false;
		} else {
			System.out.println("O carro ja está desligado...");
			
		}

	}
	
	public void acelerar() {
		if (estaLigado) {
			System.out.println("Vruuuum Vruuuum");
		} else {
			System.out.println("O carro está desligado...");
		}
	}
	
	public void frear() {
		if (estaLigado) {
			System.out.println("iiiiiiiiiiiihh iiihhhhhh O carro freou");
		} else {
			System.out.println("O carro está desligado...");
		}
		
		
	}
	
	public void abastecer() {
		System.out.println("Abastecendo carro...");
	}
	
	
}
