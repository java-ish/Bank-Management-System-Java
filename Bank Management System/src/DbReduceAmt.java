import java.sql.*;

import com.mysql.jdbc.Connection;
public class DbReduceAmt {
	public static boolean deductAmt(int amt, String account_num) {
//		database connectivity
		String url = "jdbc:mysql://localhost:3306/java";
		String username = "root";
		String password = "";
		String sql_update = "update manishbank set amount=? where accNum=?";
		String sql_query = "select * from manishbank where accNum=?";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql_query);
			st.setString(1, account_num);
			ResultSet rs = st.executeQuery();
			
//			fetching old value and summing up
			int Oldamount=0;
			if (rs.next()) {
				Oldamount = rs.getInt("amount");
			}
			
			if (amt>Oldamount) {
				return false;
			}
			amt = Oldamount-amt;
			
//			updating the amount
			PreparedStatement se = con.prepareStatement(sql_update);
			se.setInt(1, amt);
			se.setString(2, account_num);
			se.executeUpdate();
//			layout
			for (int i = 1; i < 120; i++) {
				System.out.print("*");
			}
			System.out.println("");
			System.out.println("Your updated bank balance is Rs." + amt);
//			layout
			for (int i = 1; i < 120; i++) {
				System.out.print("-");
			}
			System.out.println("");
			return true;
		} catch (Exception e) {
			System.out.println("Something went wrong!");
		}
		return false;
	}
}
