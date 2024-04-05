package br.com.projetoteste.teste;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 24;
		String nome = "Luid Lellis";
		double salarioDouble = 1233.25; // A double não arredonda o numero
		float salarioFloat = 1233.25f; // A Float arredonda o numero após a terceira casa

		System.out.println(idade);
		System.out.println(nome);
		System.out.println(salarioDouble);
		System.out.println(salarioFloat);
		System.out.println("Meu nome é " + nome);
		System.out.println("Meu nome é " + nome + " e a idade " + idade);
// Abaixo além de concatenar eu também ultilizei a quebra de linha
		System.out.println("Meu nome é " + nome + "\ne a idade " + idade);

	}

}
