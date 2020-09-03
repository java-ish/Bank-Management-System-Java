import java.util.Scanner;

public class DepositMoney {
	Scanner userInpt = new Scanner(System.in);
	public void addMoney() {
			System.out.println("");
//		layout
		for (int i = 1; i < 120; i++) {
			System.out.print("-");
		}
		System.out.println("");
		System.out.println("\t\t\t\t\t\"Please Login to deposit money!\"");
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
			System.out.println("Enter the amount you want to add:");
			int addingAmt = userInpt.nextInt();
			if (DbUpdateAmt.updateAmt(addingAmt, logInAccNum)) {
				System.out.println("Amount added to your account successfully!");
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
			addMoney();
		}
	}
}
