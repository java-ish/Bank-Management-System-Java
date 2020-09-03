import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class logIn {
	public boolean logInCheck(String account_number, String pin) {
//		database connectivity
		String url = "jdbc:mysql://localhost:3306/java";
		String username = "root";
		String password = "";
		String sql_query = "select * from manishbank where accNum=? and pin=?";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection(url, username, password);
			PreparedStatement se = con.prepareStatement(sql_query);
			se.setString(1, account_number);
			se.setString(2, pin);
			ResultSet re = se.executeQuery();
			
			if (re.next()) {
				return true;
			}
			
		} 
		catch (Exception e) {
			System.out.println("Something went wrong!");
		}
		return false;
	}
}
