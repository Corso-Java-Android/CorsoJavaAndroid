package database.test01;

import java.sql.Statement;

import database.exceptions.MyDatabaseException;
import database.util.ConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class FirstConnection {

	public static void main(String[] args) throws MyDatabaseException{
		
		Connection connection = null;
		String query = "select id as codice, nome as regione from regioni";
		Statement st = null;
		ResultSet rs = null;
		
		try {
			connection = ConnectionManager.getInstance().getConnection();
			st = connection.createStatement();
			rs = st.executeQuery(query);
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			while( rs.next() ) {
				System.out.print(rsmd.getColumnLabel(1));
				System.out.print("=");
				System.out.print( rs.getInt("id") );
				System.out.print(" ");
				System.out.print(rsmd.getColumnLabel(2));
				System.out.print("=");
				System.out.println( rs.getString(2) );			
			}
			return;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new MyDatabaseException(e);
		} finally {
			System.out.println("eseguito in ogni caso ...");
			try { rs.close(); } catch (Exception e) {}
			try { st.close(); } catch (Exception e) {}
			try { connection.close(); } catch (Exception e) {}
		}	
	}
}