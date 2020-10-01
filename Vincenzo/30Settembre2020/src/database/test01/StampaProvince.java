package database.test01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.exceptions.MyDatabaseException;
import database.util.ConnectionManager;

public class StampaProvince {

	public static void main(String[] args) throws MyDatabaseException {
		// Stampa id regione, nome regione, id_provincia, nome provincia, sigla automobilistica
		//110 righe di 5 colonne

		Statement st = null;
		ResultSet rs = null;
		Connection connection = null;

		try {
			connection = ConnectionManager.getInstance().getConnection();

			String query = "select p.id_regione, r.nome, p.id, p.nome, p.sigla_automobilistica "
					+ "from province p, regioni r where p.id_regione=r.id";

			st = connection.createStatement();

			rs = st.executeQuery(query);

			int count = 0;

			while(rs.next()) {
				System.out.print("id regione=");
				System.out.print(rs.getInt("id_regione"));
				System.out.print(" nome regione=");
				System.out.print(rs.getString(2));
				System.out.print(" id provincia=");
				System.out.print(rs.getInt(3));
				System.out.print(" nome=");
				System.out.print(rs.getString(4));
				System.out.print(" sigla automobilistica=");
				System.out.println(rs.getString(5));
				count++;
			}

			System.out.println("Ci sono "+count+" province.");
		}catch(SQLException e) {
			System.out.println("***************************************************************Sono all'interno della catch");
			throw new MyDatabaseException();
		}
		finally {
			System.out.println("eseguito in ogni caso...");
			try {rs.close();} catch (SQLException e) {}
			try {st.close();} catch (SQLException e) {}
			try {connection.close();} catch (SQLException e) {}
		}

	}

}
