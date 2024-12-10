package Heranca;


public class Aluno extends Pessoa {
	
	public double nota;
	
	public Aluno(String nome, String cpf, String telefone) {
		super(nome, cpf, telefone);
		
	}
	
	
	public void sofrer() {
		System.out.println("Aaah estou sofrendo!");
	}

}
