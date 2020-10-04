package database.util;

//ESEMPIO DI SINGLETON


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionManager {

	private static final String DRIVER_NAME  = "org.mariadb.jdbc.Driver";
	private static final String DATABASE_URL = "jdbc:mariadb://localhost:3306/master?user=master&password=manager";
	
	//private static final ConnectionManager = new ConnectionManager();
	private static ConnectionManager instance = null;
	
	private ConnectionManager() {} 
	
	
	public static final ConnectionManager getInstance() {
		if(instance == null) {
			instance = new ConnectionManager();
		}
		return instance;
	}
	
	static {  //blocco static viene eseguito per primo
		try {
			Class.forName(ConnectionManager.DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(-1);
		}
	}
	
	public Connection getConnection() throws SQLException {
		Connection connection = null;
		
		connection = DriverManager.getConnection(ConnectionManager.DATABASE_URL);
		return connection;
	
		
	}
	

}
