import java.util.Scanner;

public class WithdrawMoney {
	Scanner userInpt = new Scanner(System.in);
	
	public void deductMoney() {
		System.out.println("");
		
//		layout
		for (int i = 1; i < 120; i++) {
			System.out.print("-");
		}
		System.out.println("");
		System.out.println("\t\t\t\t\t\"Please Login to withdraw money!\"");
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
			System.out.println("Enter the amount you want to withdraw:");
			int reducingAmt = userInpt.nextInt();
			if (DbReduceAmt.deductAmt(reducingAmt, logInAccNum)) {
				System.out.println("Amount withdrawn from your account successfully!");
//				layout
				for (int i = 1; i < 120; i++) {
					System.out.print("*");
				}
				System.out.println("");
				
			}
			else {
//				layout
				for (int i = 1; i < 120; i++) {
					System.out.print("*");
				}
				System.out.println("");
				System.out.println("You don't have this much amount in the account!");
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
			deductMoney();
		}
	}
}
