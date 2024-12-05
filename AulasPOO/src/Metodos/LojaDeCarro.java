package Metodos;

public class LojaDeCarro {

	public static void main(String[] args) {

		Carro c1 = new Carro();
		Carro c2 = new Carro("Azul");
		Carro c3 = new Carro("Azul", "Uno", 1500);
		
		c3.ligar();
		c3.acelerar();
		c3.frear();
		c3.abastecer();
		c3.desligar();

		Honda civic = new Honda("V8", "Azul", "Civic", 50000);
		
		

	}

}
