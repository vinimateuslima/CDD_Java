package Metodos;

import javax.swing.JOptionPane;

public class Tela {

	public static void main(String[] args) {

		// obtém a entrada de usuário a partir dos diálogos de entrada JOptionPane
		String firstNumber = JOptionPane.showInputDialog("Enter first integer");
		String secondNumber = JOptionPane.showInputDialog("Enter second integer");

		// converte String em valores int para utilização em um cálculo
		int number1 = Integer.parseInt(firstNumber);
		int number2 = Integer.parseInt(secondNumber);

		int sum = number1 + number2; // soma os números

		// exibe o resultado em um diálogo de mensagem JOptionPane
		JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);

	}

}
