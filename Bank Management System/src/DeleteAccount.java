import java.util.Scanner;

public class DeleteAccount {
	Scanner userInpt = new Scanner(System.in);
	
	public void delete() {
			System.out.println("");
//		layout
		for (int i = 1; i < 120; i++) {
			System.out.print("-");
		}
		System.out.println("");
		System.out.println("\t\t\t\"Please fill out the field given below to delete the account!\"");
//		layout
		for (int i = 1; i < 120; i++) {
			System.out.print("-");
		}
		System.out.println("");
		
		System.out.println("Enter your account number:");
		String logInAccNum = userInpt.nextLine();
		
		System.out.println("Enter your PIN number:");
		String logInPIN = userInpt.nextLine();
		
		logIn logInObj = new logIn();
		
//		checking and further execution
		if (logInObj.logInCheck(logInAccNum, logInPIN)) {
			if (DbDelete.del(logInAccNum)) {
//				layout
				for (int i = 1; i < 120; i++) {
					System.out.print("*");
				}
				System.out.println("");
				System.out.println("Account deleted successfully!");
//				layout
				for (int i = 1; i < 120; i++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		else {
//			layout
			for (int i = 1; i < 120; i++) {
				System.out.print("*");
			}
			System.out.println("");
			System.out.println("Please, fill out the fields properly!");
//			layout
			for (int i = 1; i < 120; i++) {
				System.out.print("*");
			}
			System.out.println("");
			delete();
		}
	}
}
