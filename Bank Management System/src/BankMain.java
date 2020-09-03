import java.util.*;

class BankMain{
	static int userOptChoice;
	static Scanner userInpt = new Scanner(System.in);
	public static void openingMenu() {
		if ((OpeningScreen.logInAccNum).equals("140000005365")) {
			BankOperator.bankSide();
		}
		else {
			user.userSide();
		}
	}
}
