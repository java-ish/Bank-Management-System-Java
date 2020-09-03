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
		
		
		logIn logInObj = new logIn();
		
//		checking and further execution
		if (logInObj.logInCheck(OpeningScreen.logInAccNum, OpeningScreen.logInPIN)) {
			System.out.println("Enter the amount you want to withdraw:");
			int reducingAmt = userInpt.nextInt();
			if (DbReduceAmt.deductAmt(reducingAmt, OpeningScreen.logInAccNum)) {
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
	}
}
