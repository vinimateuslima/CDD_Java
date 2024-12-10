package Heranca;

public class Professor extends Pessoa {

	public double salario;

	public Professor(String nome, String cpf, String telefone) {
		super(nome, cpf, telefone);

	}

	public void certificar(Aluno aluno) {
		System.out.println("O aluno " + aluno.nome + " Está certificado!");
	}

	public void diversao(Aluno aluno) {
		System.out.println("Estou me divertindo porque reprovei o aluno " + aluno.nome + " hahahahaha!");
	}

}
