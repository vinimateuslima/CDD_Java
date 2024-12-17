package Encapsulamento;

public class Animal {
	
	private String nome, tutor, rg, raca, mesAniversario;
	
	private int idade;

	public void ajustarNome(String nome) {
		this.nome=nome;
	}
	
	public void mostrarNome() {
		System.out.println(this.nome);
	}
	
	public void ajustarTutor(String tutor) {
		this.tutor=tutor;
	}
	
	public void mostrarTutor() {
		System.out.println(this.tutor);
	}
	
	public void ajustarRg(String rg) {
		this.rg=rg;
	}
	
	public void mostrarRg() {
		System.out.println(this.rg);
	}
	
	public void ajustarRaca(String raca) {
		this.raca=raca;
	}
	
	public void mostrarRaca() {
		System.out.println(this.raca);
	}
	
	public void ajustarMesAniversario(String mesAniversario) {
		this.mesAniversario=mesAniversario;
	}
	
	public void mostrarMesAniversario() {
		System.out.println(this.mesAniversario);
	}
	
	public void ajustarIdade(int idade) {
		this.idade=idade;
	}
	
	public void mostrarIdade() {
		System.out.println(this.idade);
	}
	

}
