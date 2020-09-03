import java.util.*;

class menu{
	static int userOptChoice;
	static Scanner userInpt = new Scanner(System.in);
	public static void openingMenu() {
//		layout
		System.out.print("\t\t\t");
		for (int i = 1; i < 33; i++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.println("\t\t\t\t\"Manish Bank Menu\"");
//		layout
		System.out.print("\t\t\t");
		for (int i = 1; i < 33; i++) {
			System.out.print("-");
		}
		System.out.println("");
		System.out.println("\t\t\t  1. Open a bank account");
		System.out.println("\t\t\t  2. Deposit Money");
		System.out.println("\t\t\t  3. Withdraw Money");
		System.out.println("\t\t\t  4. Account Details");
		System.out.println("\t\t\t  5. Delete a bank account");
		System.out.println("\t\t\t  6. Exit");
//		layout
		System.out.print("\t\t\t");
		for (int i = 1; i < 33; i++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.println("Enter your option:");
		userOptChoice = userInpt.nextInt();
		
//		checking options
		switch (userOptChoice) {
		case 1:
			BankAccount obj1 = new BankAccount();
			obj1.newAccount();
			menu.openingMenu();
			break;
			
		case 2:
			DepositMoney obj2 = new DepositMoney();
			obj2.addMoney();
			menu.openingMenu();
			break;
			
		case 3:
			WithdrawMoney obj3 = new WithdrawMoney();
			obj3.deductMoney();
			menu.openingMenu();
			break;
		
		case 4:
			AccountDetails obj4 = new AccountDetails();
			obj4.accountInfo();
			menu.openingMenu();
			break;
			
		case 5:
			DeleteAccount obj5 = new DeleteAccount();
			obj5.delete();
			menu.openingMenu();
			break;
			
		case 6:
			System.out.println("*****************************************");
			System.out.println("Thank you! Have a great time ahead...");
			System.out.println("*****************************************");
			System.exit(0);
			break;

		default:
			System.out.println("*****************************************");
			System.out.println("Please enter the correct option!");
			System.out.println("*****************************************");
			menu.openingMenu();
			break;
		}
	}
}
public class BankMain{
	public static void main(String[] args) {
		
//		calling main-menu
		menu.openingMenu();
		
	}
}
