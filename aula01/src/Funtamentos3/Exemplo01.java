package Funtamentos3;

import java.util.StringTokenizer;

public class Exemplo01 {

	public static void main(String[] args) {

		String str = "Hello World";
		String resultado = str.replace("l", "w");

		System.out.println(resultado);

		int tres = 3;

		System.out.println(3 + " concatenar");

		resultado = str.substring(6);

		System.out.println(resultado);

		resultado = str.substring(3, 8);

		System.out.println(resultado);

		resultado = str.toUpperCase();

		System.out.println(resultado);

		resultado = str.toLowerCase();

		System.out.println(resultado);

		resultado = str.trim();

		System.out.println(resultado);

		char c = resultado.charAt(1);

		System.out.println(c);

		String resultado2 = "HELLO WORLD";

		boolean b1 = resultado.equals(resultado2);

		System.out.println(b1);

		boolean b2 = resultado.equalsIgnoreCase(resultado2);

		System.out.println(b2);

		String s = "abc";

		int tam = s.length();

		System.out.println(s);

		str = "Hello World World2";

		int pos = str.indexOf("l");

		System.out.println(pos);

		pos = str.lastIndexOf("l");

		System.out.println(pos);

		String valor = "CDD4.0 - Java";
		System.out.println(valor.compareTo("CDD4.0 - Java") == 0 ? true : false);
		System.out.println(valor.compareTo("CDD4.0 - JAVA") == 0 ? true : false);
		System.out.println(valor.compareToIgnoreCase("CDD4.0 - JAVA") == 0 ? true : false);

		valor = "CDD - Java";
		System.out.println(valor.endsWith("Java"));
		System.out.println(valor.startsWith("C"));
		System.out.println(valor.startsWith("DD", 1));
		
		StringTokenizer exemplo = new StringTokenizer("O mundo não é mais o mesmo, mas não iremos desistir nunca");
		System.out.println(exemplo.countTokens());
		
		

	}

}
