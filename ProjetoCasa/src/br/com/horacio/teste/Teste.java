package br.com.horacio.teste;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
		
		System.out.println("Meu nome é " + nome + " e eu tenho " + idade + " anos.");
		

	}

}
