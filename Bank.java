import java.util.Scanner;

class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
		ATM atm = new ATM();
		BankTransactions bankTransactions = new BankTransactions();
		for (;;) {
			System.out.println();
			System.out.println("choose an option >>");
			System.out.println(
					"1. add Account   2. remove Account   3. addMoney   4. withdrawMoney  5. check balance  6. exit "); // System.out.println();
			System.out.println("7. change mobNo./Aadhar No.     8. Connect To Atm >>>");
			switch (sc.nextInt()) {
			case 1:
				account.createAccount();
				break;
			case 2:
				account.removeAccount();
				break;
			case 3:
				bankTransactions.addMoney();
				break;
			case 4:
				bankTransactions.withdrawMoney();
				break;
			case 5:
				bankTransactions.printBalance();
				break;
			case 6:
				System.out.println("Thank You For Visiting US !!!");
				System.out.println("Visit Again !!!");
				System.exit(0);
			case 7:
				account.changeAccountDetails();
				break;
			case 8:
				atm.atmTransaction();
				break;
			default:
				System.out.println("choose an correct Option ??");
				break;
			}
		}
	}
}