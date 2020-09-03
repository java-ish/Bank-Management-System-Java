import java.sql.*;

import com.mysql.jdbc.Connection;

public class DbDelete {
public static boolean del(String account_number) {
//	database connectivity
	String url = "jdbc:mysql://localhost:3306/java";
	String username = "root";
	String password = "";
	String sql_query = "delete from manishbank where accNum=?";
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection(url, username, password);
		PreparedStatement se = con.prepareStatement(sql_query);
		se.setString(1, account_number);
		int del = se.executeUpdate();
		return true;
	} catch (Exception e) {
		System.out.println("Something went wrong!");
	}
	return false;
}
}
