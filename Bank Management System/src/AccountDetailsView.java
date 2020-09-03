import java.sql.*;

import com.mysql.jdbc.Connection;
public class AccountDetailsView {
	public static void display(String account_num) {
//		database connectivity
		String url = "jdbc:mysql://localhost:3306/java";
		String username = "root";
		String password = "";
		String sql_query = "select * from manishbank where accNum=?";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql_query);
			st.setString(1, account_num);
			ResultSet rs = st.executeQuery();
			
//			fetching old value and summing up
			if (rs.next()) {
//				layout
				for (int i = 1; i < 120; i++) {
					System.out.print("*");
				}
				System.out.println("");
				System.out.println("\t\t\t\t\tAccount Details of " + rs.getString("name"));
//				layout
				for (int i = 1; i < 120; i++) {
					System.out.print("-");
				}
				System.out.println("");
				System.out.println("Bank ID: " + rs.getInt("id"));
				System.out.println("User name: " + rs.getString("name"));
				System.out.println("User email: " + rs.getString("email"));
				System.out.println("User phone: " + rs.getString("phone"));
				System.out.println("User age: " + rs.getInt("age"));
				System.out.println("User address: " + rs.getString("address"));
//				layout
				for (int i = 1; i < 120; i++) {
					System.out.print("-");
				}
				System.out.println("");
				System.out.println("Account Number: " + rs.getString("accNum"));
				System.out.println("Total Amount: Rs." + rs.getString("amount"));
//				layout
				for (int i = 1; i < 120; i++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			else {
				System.out.println("Something went wrong!");
			}
			

		} catch (Exception e) {
			System.out.println("Something went wrong!");
		}
	}
}
