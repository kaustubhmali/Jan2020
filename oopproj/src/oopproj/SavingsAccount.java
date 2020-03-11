package oopproj;

import java.util.Scanner;
import java.time.LocalDate;


public class SavingsAccount {
	
	public int accountNo;
	public int balance;
	public String branch;
	AccountStatus status;
	public int pin;
	public LocalDate openingDate;
	public static int minimumBalance = 1000;
	
	public SavingsAccount(int accountNo, int balance, String branch, AccountStatus status, int pin,
			LocalDate openingDate) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.branch = branch;
		this.status = status;
		this.pin = pin;
		this.openingDate = openingDate;
	}

	Scanner scanner = new Scanner(System.in);
	/*
	public void inputDetails(String info) {
		
		switch(info) {
		case "accountNo":
			accountNo = scanner.nextInt();
			break;
		case "balance" :
			balance = scanner.nextInt();
			break;
		case "branch" :
			System.out.println("\n1. Navpada Branch\n2. Kapurbavdi Branch.\n3. Wagle Estate Branch.");
			String branchNo = scanner.next();
			switch(branchNo) {
			case "1" :
				branch = "Navpada Branch";
				break;
			case "2" :
				branch = "Kapurbavdi Branch";
				break;
			case "3" :
				branch = "Wagle Estate Branch";
				break;
			default :
				System.err.println("Invalid Input");
			}
			break;
		case "pin" :
			pin = scanner.nextInt();
			break;
		default :
			System.err.print("Invalid Input");
		} 
	}

	public void getInputDetails() {
		
		System.out.print("Enter the Account Number: ");
		inputDetails("accountNo");
		System.out.print("\nEnter Initial Amount to deposit: ");
		inputDetails("balance");
		System.out.print("\nSelect Branch: ");
		inputDetails("branch");
		System.out.print("\nEnter your Pin: ");
		inputDetails("pin");
	}
	*/
	public void printDetails() {
		
		System.out.println("\nAll your Account Deatils are as follows: ");
		System.out.println("Account Number: "+accountNo);
		System.out.println("Balance: "+balance);
		System.out.println("Branch: "+branch);
		System.out.println("Pin: "+pin);
		System.out.println("Status: "+AccountStatus.ACTIVE);
		System.out.println("Local Date: "+openingDate);
	}
	
	public void accountActions() {
		
		System.out.println("\nPlease perefered account transaction: ");
		System.out.println("1. Deposit\n2. Withdraw\n3. View Balance\n4. Use ATM");
		System.out.print("Enter your selection: ");
		int action = scanner.nextInt();
		switch(action) {
		case 1 :
			System.out.println("Enter the amount you want to Deposit: ");
			int depositAmount = scanner.nextInt();
			deposit(depositAmount);
			System.out.println("Updated Balance: "+balance);
			break;
		case 2 :
			System.out.println("Enter the amount you want to withdraw: ");
			int withdrawAmount = scanner.nextInt();
			withdraw(withdrawAmount);
			
			break;
		case 3 :
			System.out.println("Your current Balance is "+balance);
			break;
		case 4 :
			System.out.println("Use the ATM");
			System.out.print("Please Enter the Pin: ");
			withdraw(pin,500);
			break;
		default :
			System.err.println("Invald Input");
			break;
		}
		
	}
	
	private void deposit(int depositAmount) {
		
		if(depositAmount > 0) {
			balance = balance + depositAmount;
		} else {
			System.err.println("Invalid Deposit Amount");
		}
	}
	
	private void withdraw(int withdrawalAmount) {
		
		if(withdrawalAmount <= balance) {
			balance = balance - withdrawalAmount;
			System.out.println("Update Balance: "+balance);
			accountActions();
		} else {
			System.err.println("You have Insufficient Balance");
		}
	}
	
	public void withdraw(int pin, int withdrawlimit) {
		pin = scanner.nextInt();
		if (this.pin == pin) {
			System.out.print("Enter the amount you want to Withdraw: ");
			int atmAmount = scanner.nextInt();
			if (atmAmount <= withdrawlimit) {
		
				withdraw(atmAmount);
				
			} else {
				System.err.println("Withdraw limit exceeded");
			}
		} else {
			System.err.println("Invalid Pin");
		}
		
	}
	
}
 