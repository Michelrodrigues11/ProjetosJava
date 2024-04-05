package br.com.fabricacalcado.teste;

import java.sql.Connection;

import br.com.fabricacalcado.conexao.Conexao;
import br.com.fabricacalcado.dao.SapatoDAO;
import br.com.fabricacalcado.model.Sapato;



public class TesteDeletarSapato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();

		Sapato sapato = new Sapato();
		SapatoDAO sapatodao = new SapatoDAO(con);

		sapato.setNome("Havaiana de pau");
	

		System.out.println(sapatodao.deletar(sapato));

		Conexao.fecharConexao(con);
	}

}
