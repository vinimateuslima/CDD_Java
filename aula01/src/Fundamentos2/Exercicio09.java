package Fundamentos2;

public class Exercicio09 {

	public static void main(String[] args) {

		int x = 0, y = 0;

		for (int i = 1; i <= 20; i++) {

			if (i % 3 == 0) {
				x += i;
			}

			if (i % 5 == 0) {
				y += i;
			}

		}

		int resultado = x + y;
		
		System.out.println(resultado);

	}

}
