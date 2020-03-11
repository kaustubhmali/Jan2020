package oopproj;

import java.time.LocalDate;
import java.util.Scanner;

public class Test{
	
	

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the Account Number: ");
			int accountNo = scanner.nextInt();
			System.out.print("\nEnter Initial Amount to deposit: ");
			int balance = scanner.nextInt();
			String branch = "";
			System.out.println("\n1. Navpada Branch\n2. Kapurbavdi Branch.\n3. Wagle Estate Branch.");
			System.out.print("\nSelect Branch: ");
			int branchNo = scanner.nextInt();
			switch(branchNo) {
			case 1 :
				branch = "Navpada Branch";
				break;
			case 2 :
				branch = "Kapurbavdi Branch";
				break;
			case 3 :
				branch = "Wagle Estate Branch";
				break;
			default :
				System.err.println("Invalid Input");
			}
			System.out.print("\nEnter your Pin: ");
			int pin = scanner.nextInt();
			LocalDate openingDate = LocalDate.of(2005,8,14);
			
			
			SavingsAccount account = new SavingsAccount(accountNo, balance,branch,AccountStatus.ACTIVE,pin,openingDate);

			account.printDetails();
			account.accountActions();
		/*	
			JuniorSavingsAccount juniorAccount = new JuniorSavingsAccount(accountNo, balance, branch, AccountStatus.ACTIVE, pin, openingDate, "Harry");
			juniorAccount.printDetails();
			juniorAccount.accountActions();
			*/
			
		}
		
		
	}

}
