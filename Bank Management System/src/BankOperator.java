public class BankOperator {
	public static void bankSide() {
//		layout
		System.out.print("\t\t\t\t\t");
		for (int i = 1; i < 33; i++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\"Manish Bank Menu\"");
//		layout
		System.out.print("\t\t\t\t\t");
		for (int i = 1; i < 33; i++) {
			System.out.print("-");
		}
		System.out.println("");
		System.out.println("\t\t\t\t\t  1. Open a bank account");
		System.out.println("\t\t\t\t\t  2. Deposit Money");
		System.out.println("\t\t\t\t\t  3. Withdraw Money");
		System.out.println("\t\t\t\t\t  4. Account Details");
		System.out.println("\t\t\t\t\t  5. Delete a bank account");
		System.out.println("\t\t\t\t\t  6. Exit");
//		layout
		System.out.print("\t\t\t\t\t");
		for (int i = 1; i < 33; i++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.println("Enter your option:");
		BankMain.userOptChoice = BankMain.userInpt.nextInt();
		
//		checking options
		switch (BankMain.userOptChoice) {
		case 1:
			BankAccount obj1 = new BankAccount();
			obj1.newAccount();
			BankMain.openingMenu();
			break;
			
		case 2:
			DepositMoney obj2 = new DepositMoney();
			obj2.addMoney();
			BankMain.openingMenu();
			break;
			
		case 3:
			WithdrawMoney obj3 = new WithdrawMoney();
			obj3.deductMoney();
			BankMain.openingMenu();
			break;
		
		case 4:
			AccountDetails obj4 = new AccountDetails();
			obj4.accountInfo();
			BankMain.openingMenu();
			break;
			
		case 5:
			DeleteAccount obj5 = new DeleteAccount();
			obj5.delete();
			BankMain.openingMenu();
			break;
			
		case 6:
//			layout
			for (int i = 1; i < 120; i++) {
				System.out.print("*");
			}
			System.out.println("");
			System.out.println("Thank you! Have a great time ahead...");
//			layout
			for (int i = 1; i < 120; i++) {
				System.out.print("*");
			}
			System.out.println("");
			System.exit(0);
			break;

		default:
//			layout
			for (int i = 1; i < 120; i++) {
				System.out.print("*");
			}
			System.out.println("");
			System.out.println("Please enter the correct option!");
//			layout
			for (int i = 1; i < 120; i++) {
				System.out.print("*");
			}
			System.out.println("");
			BankMain.openingMenu();
			break;
		}
	}
}
