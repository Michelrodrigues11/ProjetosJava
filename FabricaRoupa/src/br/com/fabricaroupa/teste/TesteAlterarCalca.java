package br.com.fabricaroupa.teste;

import java.sql.Connection;

import br.com.fabricaroupa.conexao.Conexao;
import br.com.fabricaroupa.dao.CalcaDAO;
import br.com.fabricaroupa.model.Calca;

public class TesteAlterarCalca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();

		Calca calca = new Calca();
		CalcaDAO calcadao = new CalcaDAO(con);

	
		calca.setTipo("Sport Fino");
		calca.setTipoTecido("Sarja");
		

		System.out.println(calcadao.alterarTipoTecidoCalca(calca));

		Conexao.fecharConexao(con);
	}

}
