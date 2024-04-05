package br.com.horacio.teste;

import javax.swing.JOptionPane;

public class Teste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
		
		if (idade >= 18) {
			
			System.out.println("Tenho " + idade + " anos e sou maior de idade " );
			
		}
		
		else {
			System.out.println("Tenho " + idade + " anos e sou menor de idade ");
		}
		
		
		}

}

