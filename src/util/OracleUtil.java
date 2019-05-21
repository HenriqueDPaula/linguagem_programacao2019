package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Classe destinada à conexão com o Oracle
 * 
 * @author Henrique de Paula
 */
public class OracleUtil {

	public static final String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String ORACLE_USER = "aluno";
	public static final String ORACLE_PWD = "aluno";

	public static void teste() {

		Connection con = openConnection();

		try {

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from teste");

			while (rs.next()) {
				System.out.println(rs.getString(1));
			}

			con.close();
		} catch (Exception e) {
			System.out.println("Erro ao conectar ao banco de dados Oracle, Exception: " + e.getMessage());
		}
	}

	/**
	 * Abrir a conexão com o Oracle
	 * 
	 * @return conexão
	 */
	public static Connection openConnection() {

		Connection con = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			System.out.println("Creating a connection with DB..");
			con = DriverManager.getConnection(ORACLE_URL, ORACLE_USER, ORACLE_PWD);
			System.out.println("Connected.");

		} catch (Exception e) {
			System.out.println("Não foi possível abrir a conexão com o Oracle: " + e.getMessage());
		}

		return con;
	}

	/**
	 * Exemplo de insert ao banco de dados Oracle
	 */
	public static void insert() {
		Connection con = null;
		Statement stmt = null;

		String queryInsert = "insert into teste values ('Carlão')";

		try {

			con = openConnection();
			stmt = con.createStatement();

			System.out.println("Trying to insert into DB");
			System.out.println("Query: " + queryInsert);

			stmt.executeUpdate(queryInsert);
			System.out.println("Success!");
			System.out.println("");

		} catch (Exception e) {

			System.out.println("Erro ao inserir no banco de dados: " + e.getMessage());

		} finally {

			try {
				if (stmt != null)
					stmt.close();

				if (con != null)
					con.close();

			} catch (SQLException e) {
				System.out.println("Não foi possível fechar a conexão: " + e.getMessage());
			}
		}
	}

	/**
	 * Exemplo de update de registro ao banco de dados Oracle
	 */
	public static void update() {
		Connection con = null;
		Statement stmt = null;

		String queryUpdate = "update teste set nome = 'Mauricio' where nome = 'Carlão'";

		try {

			con = openConnection();
			stmt = con.createStatement();

			System.out.println("Trying to update data in DB");
			System.out.println("Query: " + queryUpdate);

			stmt.executeUpdate(queryUpdate);
			System.out.println("Success!");
			System.out.println("");

		} catch (Exception e) {

			System.out.println("Erro ao atualizar registro no banco de dados: " + e.getMessage());

		} finally {

			try {
				if (stmt != null)
					stmt.close();

				if (con != null)
					con.close();

			} catch (SQLException e) {
				System.out.println("Não foi possível fechar a conexão: " + e.getMessage());
			}
		}
	}

	/**
	 * Exemplo de delete ao banco de dados Oracle
	 */
	public static void delete() {
		Connection con = null;
		Statement stmt = null;

		String queryDelete = "delete from teste where nome = ?";

		try {
			con = openConnection();
			stmt = con.createStatement();

			PreparedStatement pstmt = con.prepareStatement(queryDelete);
			pstmt.setString(1, "Mauricio");

			System.out.println("Trying to delete in DB");
			pstmt.executeUpdate();

			System.out.println("Success!");
			System.out.println("");

		} catch (Exception e) {

			System.out.println("Erro ao deletar registro no banco de dados: " + e.getMessage());

		} finally {

			try {
				if (stmt != null)
					stmt.close();

				if (con != null)
					con.close();

			} catch (SQLException e) {
				System.out.println("Não foi possível fechar a conexão: " + e.getMessage());
			}
		}
	}

	public static void select() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		String querySelect = "select * from teste";

		try {

			con = openConnection();
			stmt = con.createStatement();

			rs = stmt.executeQuery(querySelect);

			System.out.println("Query: " + querySelect);

			while (rs.next()) {
				System.out.println(rs.getString(1));
			}

		} catch (Exception e) {

			System.out.println("Erro ao inserir no banco de dados: " + e.getMessage());

		} finally {

			try {
				if (stmt != null)
					stmt.close();

				if (con != null)
					con.close();

			} catch (SQLException e) {
				System.out.println("Não foi possível fechar a conexão: " + e.getMessage());
			}
		}
	}
}
