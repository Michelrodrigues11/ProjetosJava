package br.com.samsung.teste;

import javax.swing.JOptionPane;

import br.com.samsung.model.Celular;
import br.com.samsung.model.LinhaBranca;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinhaBranca linhabranca = new LinhaBranca();
		LinhaBranca linhabranca2 = new LinhaBranca();
 
		Celular celular = new Celular();
		Celular celular2 = new Celular();

		linhabranca.setNome("Geladeira Industrial");
		linhabranca.setPeso(230);
		linhabranca.setTipo("geladeira");

		celular.setNome("Sansung 56");
		celular.setAlturaTela(0.17);
		celular.setLarguraTela(0.09);
		celular.setPeso(2);

		linhabranca2.setNome(JOptionPane.showInputDialog("Nome da linhabranca: "));
		linhabranca2.setPeso(Double.parseDouble(JOptionPane.showInputDialog("O peso �: ")));
		linhabranca2.setTipo(JOptionPane.showInputDialog("Tipo"));
		
		
		celular2.setNome(JOptionPane.showInputDialog("O Nome do Celular �: "));
		celular2.setAlturaTela(Double.parseDouble(JOptionPane.showInputDialog("A Altura � : ")));
		celular2.setLarguraTela(Double.parseDouble(JOptionPane.showInputDialog("A Largura � : ")));

		//System.out.println(linhabranca);

		//System.out.println(celular);

		System.out.println("O eletrosdom�stico � " + linhabranca2.getNome() + "e pesa " + linhabranca2.getPeso()
				+ " o tipo �" + linhabranca2.getTipo()+ "metros");

		System.out.println("O Celular � " + celular2.getNome() + "e tem " + celular2.getAlturaTela() + "de altura � "
				+ celular2.getLarguraTela() + " de largura ");

	}

}
