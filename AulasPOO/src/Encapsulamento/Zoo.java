package Encapsulamento;

public class Zoo {

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		
		a1.ajustarNome("Pé de Pano");
				
		a1.ajustarTutor("Vinicius");
		
		a1.ajustarRg("89130090");
		
		a1.ajustarRaca("Manga Larga");
		
		a1.ajustarMesAniversario("Março");
		
		a1.ajustarIdade(5);
		
		a1.mostrarNome();
		a1.mostrarTutor();
		a1.mostrarRg();
		a1.mostrarRaca();
		a1.mostrarMesAniversario();
		a1.mostrarIdade();

	}

}
