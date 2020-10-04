package database.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StampaProvince {
	
	public static void main (String args[]) throws SQLException, ClassNotFoundException {
		
		String driver = "org.mariadb.jdbc.Driver";
		Class.forName(driver);
		Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/master?user=master&password=manager");
		
		
		String query = "select r.id, r.nome, p.id, p.nome, p.sigla_automobilistica" +
		               " from regioni r " + 
				       " inner join province p " + 
		               " on p.id_regione = r.id" ;
		
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		
		while (rs.next()) {
			
			/*
			if(rs.getString(2).length() > 10) {
				//System.out.println(rs.getString(2).replace(rs.getString(2), "CIAO"));
				String s = rs.getString(2).replaceAll(rs.getString(2), "CIAO");
				
			}
			*/
			
			System.out.print("Id regione = ");
			System.out.print(rs.getInt(1)+ "; ");
			System.out.print(" ");
			
			System.out.print("Nome Regione = ");
			System.out.print(rs.getString(2)+ "; ");
			System.out.print(" ");
			
			System.out.print("Id Provincia = ");
			System.out.print(rs.getInt(3)+ "; ");
			System.out.print(" ");
			
			System.out.print("Nome Provincia = ");
			System.out.print(rs.getString(4) + ";");
			System.out.print(" ");
			
			System.out.print("Targa = ");
			System.out.print(rs.getString(5)+ ";");
			System.out.println(" ");
		}
		
		rs.close();
		st.close();
		connection.close();
	}

}
