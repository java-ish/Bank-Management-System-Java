import java.util.Scanner;

public class AccountDetails {
	Scanner userInpt = new Scanner(System.in);
	
	public void accountInfo() {
			System.out.println("");
//			layout
			for (int i = 1; i < 120; i++) {
				System.out.print("-");
			}
			System.out.println("");
		System.out.println("\t\t\t\t\t\"Please Login to view account details!\"");
//		layout
		for (int i = 1; i < 120; i++) {
			System.out.print("-");
		}
		System.out.println("");
		
		logIn logInObj = new logIn();
		
//		checking and further execution
		if (logInObj.logInCheck(OpeningScreen.logInAccNum, OpeningScreen.logInPIN)) {
			AccountDetailsView.display(OpeningScreen.logInAccNum);
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
			accountInfo();
		}
	}
}
