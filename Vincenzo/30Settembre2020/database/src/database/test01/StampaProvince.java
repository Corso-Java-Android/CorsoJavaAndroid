package database.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StampaProvince {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Stampa id regione, nome regione, id_provincia, nome provincia, sigla automobilistica
		//110 righe di 5 colonne

		String driver = "org.mariadb.jdbc.Driver";

		Class.forName(driver);

		Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/master?user=master&password=master");

		String query = "select p.id_regione, r.nome, p.id, p.nome, p.sigla_automobilistica from province p, regioni r where p.id_regione=r.id";

		Statement st = connection.createStatement();

		ResultSet rs = st.executeQuery(query);
		
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
		
		rs.close();
		st.close();
		connection.close();

	}

}
