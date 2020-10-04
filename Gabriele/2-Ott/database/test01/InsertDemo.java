package database.test01;
	import database.exception.*;
	import database.util.ConnectionManager;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
	//import java.sql.ResultSetMetaData;
	import java.sql.SQLException;
	//import java.sql.Statement;



public class InsertDemo {

		public static void main(String[] args) throws MyDataBaseException {
		
			//String driver = "org.mariadb.jdbc.Driver"; ho creato il connection manager
			//ConnectionManager cm = new ConnectionManager();   //sebbene questa classe serva per dividere la classe con un altra finzionalita fatta su connection manager ,questo è un problema perchè può fare casini, Devo
															  //devo perciò trovare un modo (1 soluzione, ho creato un singleton su connectionmanager)per dire a conn manager di creare unno e uno solo oggetto
			//Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/master?user=master&password=manager"); lo trovi nel connection manager
			
			Connection connection = null;
			
			String query = "insert into tab01 values (?, ?, ?)";
			
			PreparedStatement st = null;
			
			try {
				
				//connection = cm.getConnection();   //qui c'era prima "jdbc:mariadb://localhost:3306/master?user=master&password=manager";
				//protegge il codice
				
				connection = ConnectionManager.getInstance().getConnection(); //(1)per ovviare al problema di instanziare un solo oggetto rendo la classe connection manager attraverso il singleton
				
				//Class.forName(driver);
				
				st = connection.prepareStatement(query);
				st.setInt(1, 10);
				st.setString(2, "Descrizione LINEA 2");
				st.setFloat(3, 66.94f);
				st.executeUpdate();
	
				
			} catch (SQLException e) {
				System.out.println("Sono all'interno della catch");
				e.printStackTrace();
				throw new MyDataBaseException(e);
			} finally {
				
				
				try {st.close(); } catch (SQLException e) {}
				
				try {connection.close(); } catch (SQLException e) {}
			}
			
		}
		
}
	

