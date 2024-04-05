package br.com.fabricaroupa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import br.com.fabricaroupa.model.Blusa;

public class BlusaDAO {

		private Connection con;

		public Connection getCon() {
			return con;
		}

		public void setCon(Connection con) {
			this.con = con;
		}

		public BlusaDAO() {

		}

		public BlusaDAO(Connection con) {
			setCon(con);
		}

		public String inserir(Blusa blusa) {
			String sql = "insert into blusa(peso, tipoTecido, touca) values (?,?,?)";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ps.setDouble(1, blusa.getPeso());
				ps.setString(2, blusa.getTipoTecido());
				ps.setString(3, blusa.getTouca());
				

				if (ps.executeUpdate() > 0) {
					return "Blusa Inserida com sucesso.";
				} else {
					return "Erro ao inserir a blusa.";
				}
			} catch (SQLException e) {
				return e.getMessage();
			}
		}
		
		public String deletarSemWhereBlusa() {
			String sql = "delete from blusa";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
						
				if (ps.executeUpdate() > 0) {
					return "Blusa deletado com sucesso.";
				} else {
					return "Erro ao deletar a blusa.";
				}
			} catch (SQLException e) {
				return e.getMessage();
			}
		}
		public String deletarComWhereBlusa(Blusa blusa) {
			String sql = "delete from blusa where tipotecido like (?)";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				
				ps.setString(1, blusa.getTipoTecido());
				
				if (ps.executeUpdate() > 0) {
					return "Blusa deletado com sucesso.";
				} else {
					return "Erro ao deletar a blusa.";
				}
			} catch (SQLException e) {
				return e.getMessage();
			}
		}
		public String alterarTipoTecidoBlusa(Blusa blusa) {
			String sql = "update blusa set tipoTecido = (?) where touca = (?)";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ps.setString(1, blusa.getTipoTecido());
				ps.setString(2, blusa.getTouca());

				if (ps.executeUpdate() > 0) {
					return "Alterado com sucesso";
				} else {
					return "Erro ao Alterar";
				}
			} catch (SQLException e) {
				return e.getMessage();
			}

		}
		
		public ArrayList<Blusa> retornarDadosBlusa() {
			String sql = "select * from blusa";
			ArrayList<Blusa> retornarDadosBlusa = new ArrayList<Blusa>();
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				if (rs != null) {
					while (rs.next()) {
						Blusa blusa = new Blusa();
						blusa.setPeso(rs.getDouble(1));
						blusa.setTipoTecido(rs.getString(2));
						blusa.setTouca(rs.getString(3));
						
					

						retornarDadosBlusa.add(blusa);
					}
					return retornarDadosBlusa;
				} else {
					return null;
				}
			} catch (SQLException e) {
				return null;
			}
		}
}

