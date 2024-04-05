package br.com.fabricaroupa.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.fabricaroupa.conexao.Conexao;
import br.com.fabricaroupa.dao.BlusaDAO;
import br.com.fabricaroupa.model.Blusa;



public class TesteSelecionarBlusa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();
		BlusaDAO blusadao = new BlusaDAO(con);

		ArrayList<Blusa> lista = blusadao.retornarDadosBlusa();

		if (lista != null) {
			for (Blusa blusa : lista) {
				System.out.println("Peso da blusa: " + blusa.getPeso());
				System.out.println("Tipo Tecido: " + blusa.getTipoTecido());
				System.out.println("Com Touca?: " + blusa.getTouca() + "\n");
				;

			}
		}
		Conexao.fecharConexao(con);
	}

}
