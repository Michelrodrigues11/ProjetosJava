package br.com.fabricaroupa.teste;

import java.sql.Connection;

import br.com.fabricaroupa.conexao.Conexao;
import br.com.fabricaroupa.dao.BlusaDAO;


public class TesteDeletarSemWhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = Conexao.abrirConexao();


		BlusaDAO blusadao = new BlusaDAO(con);
		
		
		blusadao.deletarSemWhereBlusa();
		Conexao.fecharConexao(con);
		Conexao.fecharConexao(con);
	}

}
