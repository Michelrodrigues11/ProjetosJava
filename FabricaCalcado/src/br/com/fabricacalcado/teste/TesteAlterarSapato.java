package br.com.fabricacalcado.teste;

import java.sql.Connection;

import br.com.fabricacalcado.conexao.Conexao;
import br.com.fabricacalcado.dao.SapatoDAO;
import br.com.fabricacalcado.model.Sapato;

public class TesteAlterarSapato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();

		Sapato sapato = new Sapato();
		SapatoDAO sapatodao = new SapatoDAO(con);

		sapato.setTamanho(61);
		sapato.setPeso(1);
		sapato.setNome("Sapato de bico quadrado");
		sapato.setTipoTecido("Couro");

		System.out.println(sapatodao.alterarTamanhoSapato(sapato));

		Conexao.fecharConexao(con);

	}
}
