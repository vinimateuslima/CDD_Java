package Heranca;

public class Escola {

	public static void main(String[] args) {

		Aluno aluno = new Aluno("Vinicius", "74566865497", "81595356966");
		
		Professor prof = new Professor("Wellington", "74536598599", "8195568525455");
		
		prof.certificar(aluno);
		
		prof.diversao(aluno);
		
		aluno.sofrer();
		
		
	}

}
