package database.test01;
import database.exception.*;
import database.util.ConnectionManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class FirstConnection {

	public static void main(String[] args) throws MyDataBaseException {
	
		//String driver = "org.mariadb.jdbc.Driver"; ho creato il connection manager
		//ConnectionManager cm = new ConnectionManager();   //sebbene questa classe serva per dividere la classe con un altra finzionalita fatta su connection manager ,questo è un problema perchè può fare casini, Devo
														  //devo perciò trovare un modo (1 soluzione, ho creato un singleton su connectionmanager)per dire a conn manager di creare unno e uno solo oggetto
		//Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/master?user=master&password=manager"); lo trovi nel connection manager
		
		Connection connection = null;
		

		String query = "select id as 'NomeId', nome as 'Nome' " +
					   "from regioni";
		
		
		Statement st = null;
		ResultSet rs = null;
		try {
			
			//connection = cm.getConnection();   //qui c'era prima "jdbc:mariadb://localhost:3306/master?user=master&password=manager";
			//protegge il codice
			
			connection = ConnectionManager.getInstance().getConnection(); //(1)per ovviare al problema di instanziare un solo oggetto rendo la classe connection manager attraverso il singleton
			
			//Class.forName(driver);
			
			st = connection.createStatement();
			rs = st.executeQuery(query);
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			while (rs.next()) {
				System.out.print("id= ");  //nome colonna
				System.out.print(rs.getInt("id"));
				System.out.print(" ");
				
				System.out.print("regione= ");
				System.out.println( rs.getString(2));  //numero colonna ps. il primo campo parte da 1 non da 0 come negli array
				
				
			}
			/*
			while (rs.next()) {
				System.out.print(rsmd.getColumnName(1));  //nome colonna
				System.out.print(rs.getInt("id"));
				System.out.print(" ");
				
				System.out.print(rsmd.getColumnName(2));
				System.out.println( rs.getString(2));  //numero colonna ps. il primo campo parte da 1 non da 0 come negli array
				
			}
			
			
			while (rs.next()) {
				System.out.print(rsmd.getColumnLabel(1) + ":");  //nome colonna
				System.out.print(rs.getInt("id"));
				System.out.print(" ");
				
				System.out.print(rsmd.getColumnLabel(2)+ ":");
				System.out.println( rs.getString(2));  //numero colonna ps. il primo campo parte da 1 non da 0 come negli array
				
			}
			*/
			
		} catch (SQLException e) {
			System.out.println("Sono all'interno della catch");
			e.printStackTrace();
			throw new MyDataBaseException(e);
		} finally {
			
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {st.close(); } catch (SQLException e) {}
			
			try {connection.close(); } catch (SQLException e) {}
		}
		
	}
	
}
