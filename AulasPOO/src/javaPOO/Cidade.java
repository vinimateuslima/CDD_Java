package javaPOO;

public class Cidade {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		
		p1.cadastro();
		
		p2.cadastro();
		
		
		System.out.printf("%s tem %d anos e pesa %.2f quilos \n", p1.nome, p1.idade, p1.peso);
		
		p1.comer();
		
		System.out.printf("%s tem %d anos e pesa %.2f quilos \n", p2.nome, p2.idade, p2.peso);
		
		p2.comer();

	}

}
