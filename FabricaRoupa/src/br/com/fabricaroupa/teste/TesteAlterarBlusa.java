package br.com.fabricaroupa.teste;

import java.sql.Connection;

import br.com.fabricaroupa.conexao.Conexao;
import br.com.fabricaroupa.dao.BlusaDAO;
import br.com.fabricaroupa.model.Blusa;



public class TesteAlterarBlusa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();

		Blusa blusa = new Blusa();
		BlusaDAO blusadao = new BlusaDAO(con);

	

		blusa.setTipoTecido("Moletom");
		blusa.setTouca("Sim");

		System.out.println(blusadao.alterarTipoTecidoBlusa(blusa));

		Conexao.fecharConexao(con);
	}

}
