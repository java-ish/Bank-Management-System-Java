import java.util.Scanner;

public class OpeningScreen {
	static String logInAccNum, logInPIN;
	public static void main(String[] args) {
		Scanner userInpt = new Scanner(System.in);
		System.out.println("");
		
//		layout
		for (int i = 1; i < 120; i++) {
			System.out.print("-");
		}
		System.out.println("");
		System.out.println("\t\t\t\t\t\"Please Login to continue!\"");
//		layout
		for (int i = 1; i < 120; i++) {
			System.out.print("-");
		}
		System.out.println("");
		
		System.out.println("Enter your account number:");
		logInAccNum = userInpt.nextLine();
		
		System.out.println("Enter your PIN number:");
		logInPIN = userInpt.nextLine();
		
		logIn logInObj = new logIn();
		
//		checking and further execution
		if (logInObj.logInCheck(logInAccNum, logInPIN)) {
			BankMain.openingMenu();
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
		}
	}
}
