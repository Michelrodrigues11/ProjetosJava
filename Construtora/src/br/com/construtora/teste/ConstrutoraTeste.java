package br.com.construtora.teste;

import javax.swing.JOptionPane;

import br.com.construtora.model.Apartamento;
import br.com.construtora.model.Casa;
import br.com.construtora.model.Imovel;

public class ConstrutoraTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imovel imovel = new Imovel();
		Casa casa = new Casa();
		Apartamento apartamento = new Apartamento();
		
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de imovel, 1 Casa ou 2 Apartamento: "));

		apartamento.setNome("Prédio das Oliveiras");
		apartamento.setQuantidadeQuartos(2);
		apartamento.setMetrosQuadrados(80);
		apartamento.setQuantidadeVarandas(3);
		
		System.out.println("O seu apartamento chama " + apartamento.getNome()
		+ "\n o apartamento tem " + apartamento.getQuantidadeQuartos()
		+ "Quartos \n" + apartamento.getQuantidadeVarandas()
		+ "Varandas \n e tem " + apartamento.getMetrosQuadrados()
		+ "metros quadrados");
		}
		
	}

}
