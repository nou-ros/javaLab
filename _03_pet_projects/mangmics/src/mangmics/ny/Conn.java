package mangmics.ny;

import java.sql.*;

public class Conn {
	public Connection c;
	public Statement s;
	
	public Conn() {
		try {
			//registering mysql driver
			Class.forName("com.mysql.jdbc.Driver");
			//database name mangmics
			c = DriverManager.getConnection("jdbc:mysql:///mangmics", "root", "");
			// with statement(s) we will execute our queries in database. 
			s = c.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
