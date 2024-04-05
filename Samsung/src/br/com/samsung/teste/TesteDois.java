package br.com.samsung.teste;

import javax.swing.JOptionPane;
import br.com.samsung.model.Aparelho;
import br.com.samsung.model.LinhaBranca;
import br.com.samsung.model.Celular;

public class TesteDois extends Aparelho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  LinhaBranca linhabranca = new LinhaBranca();
		  
		  Celular celular = new Celular();
		
		  
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para linhabranca ou 2 para celular: "));
		
				if(escolha == 1){
					linhabranca.setNome(JOptionPane.showInputDialog("Nome da linhabranca: "));
					linhabranca.setPeso(Double.parseDouble(JOptionPane.showInputDialog("O peso é: ")));
					linhabranca.setTipo(JOptionPane.showInputDialog("Tipo"));
					
					System.out.println("O eletrosdoméstico é " + linhabranca.getNome() + "e pesa " + linhabranca.getPeso()
					+ " o tipo é " + linhabranca.getTipo());
				}
				else{
					
					celular.setNome(JOptionPane.showInputDialog("O Nome do Celular é: "));
					celular.setAlturaTela(Double.parseDouble(JOptionPane.showInputDialog("A Altura é : ")));
					celular.setLarguraTela(Double.parseDouble(JOptionPane.showInputDialog("A Largura é : ")));
					
					System.out.println("O Celular é " + celular.getNome() + "e tem " + celular.getAlturaTela() + "de altura é "
							+ celular.getLarguraTela() + " de largura ");
				}
				}
				
		
	}
