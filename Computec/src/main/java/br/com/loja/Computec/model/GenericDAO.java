package br.com.loja.Computec.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.loja.Computec.dal.ConexaoBD;

public abstract class GenericDAO {
	private Connection conexao;

	protected GenericDAO() {
		this.conexao = ConexaoBD.conectar();
	}

	protected Connection conectarDAO() {
		return conexao;
	}

	protected void save(String insertSql, Object... parametros) throws SQLException {
		PreparedStatement pstmt = conectarDAO().prepareStatement(insertSql);

		for (int i = 0; i < parametros.length; i++) {
			pstmt.setObject(i + 1, parametros[i]);
		}

		pstmt.execute();
		pstmt.close();
		conexao.close();
	}

	protected void update(String updateSql, Object id, Object... parametros) throws SQLException {
		PreparedStatement pstmt = conectarDAO().prepareStatement(updateSql);
		for (int i = 0; i < parametros.length; i++) {
			pstmt.setObject(i + 1, parametros[i]);
		}
		pstmt.setObject(parametros.length + 1, id);
		pstmt.execute();
		pstmt.close();
		conexao.close();
	}
	protected void delete(String deleteSql, Object... parametros) throws SQLException {
		PreparedStatement pstmt = conectarDAO().prepareStatement(deleteSql);

		for (int i = 0; i < parametros.length; i++) {
			pstmt.setObject(i + 1, parametros[i]);
		}

		pstmt.execute();
		pstmt.close();
		conexao.close();
	}
}
