import java.sql.*;
import java.util.Random;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
public class BankAccount{
	Scanner userInpt = new Scanner(System.in);
	int uid=0;
	int amount = 0;
	public void newAccount() {
		System.out.println("");
		
//		layout
		for (int i = 1; i < 120; i++) {
			System.out.print("-");
		}
		System.out.println("");
		
		System.out.println("\t\t\t\t\"Please fill out the form given below correctly!\"");
//		layout
		for (int i = 1; i < 120; i++) {
			System.out.print("-");
		}
		System.out.println("");
		
		System.out.println("Enter your name:");
		String userName = userInpt.nextLine();
		
		System.out.println("Enter your email:");
		String userEmail = userInpt.nextLine();
		
		System.out.println("Enter your Phone:");
		String userPhone = userInpt.nextLine();
		
		System.out.println("Enter your Age:");
		int userAge = userInpt.nextInt();
		
		System.out.println("Enter your Address:");
		String userskip = userInpt.nextLine();
		
		System.out.println("");
		String userAddress = userInpt.nextLine();
		
//		account number generation
		int b = (int)(Math.random()*(1000 - 9999));
		b = Math.abs(b);
		String accountNumber = "14000000" + b + "";
		
//		pin generation
		int a = (int)(Math.random()*(1000 - 9999));
		a = Math.abs(a);
		String pin = a+ "";
		
//		values to database insert
		String url = "jdbc:mysql://localhost:3306/java";
		String username = "root";
		String password = "";
		String sql_add = "insert into manishbank values (?,?,?,?,?,?,?,?,?)";
		String sql_query = "select * from manishbank";
		String sql_phone_check = "select * from manishbank where accNum=?";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection(url, username, password);
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(sql_query);
			
			PreparedStatement se = con.prepareStatement(sql_phone_check);
			se.setString(1, accountNumber);
			ResultSet re = se.executeQuery();
			
			
			if (re.next()) {
				b = (int)(Math.random()*(1000 - 9999));
				b = Math.abs(b);
				accountNumber = "14000000" + b + "";
			}
			else {
				while (rs.next()) {
					uid = rs.getInt(1);
					uid++;
				}
				
				PreparedStatement p = con.prepareStatement(sql_add);
				p.setInt(1, uid);
				p.setString(2, userName);
				p.setString(3, userEmail);
				p.setString(4, userPhone);
				p.setInt(5, userAge);
				p.setString(6, userAddress);
				p.setString(7, accountNumber);
				p.setString(8, pin);
				p.setInt(9, amount);
				int count = p.executeUpdate();
				
//				layout
				for (int i = 1; i < 120; i++) {
					System.out.print("*");
				}
				System.out.println("");
				System.out.println("Bank account created successfully!");
				
//				layout
				for (int i = 1; i < 120; i++) {
					System.out.print("-");
				}
				System.out.println("");
				
				System.out.println("Your account number is " + accountNumber);
				System.out.println("Your PIN number is " + pin);
				
//				layout
				for (int i = 1; i < 120; i++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
