package Metodos;

public class Honda extends Carro {

	public String motor;

	public Honda() {

	}

	public Honda(String motor, String cor, String modelo, double preco) {
		super(cor, modelo, preco);
		this.motor = motor;
	}

}
