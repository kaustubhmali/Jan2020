package oopproj;

import java.time.LocalDate;

public class JuniorSavingsAccount extends SavingsAccount{
	
	String gaurdianName;

	public JuniorSavingsAccount(int accountNo, int balance, String branch, AccountStatus status, int pin, LocalDate openingDate, String gaurdianName) {
		super(accountNo, balance, branch, status, pin, openingDate);
		this.gaurdianName = gaurdianName;
	}
	
	public void printDetails() {
		
		System.out.println("\nAll your Account Deatils are as follows: ");
		System.out.println("Account Number: "+accountNo);
		System.out.println("Balance: "+balance);
		System.out.println("Branch: "+branch);
		System.out.println("Pin: "+pin);
		System.out.println("Status: "+AccountStatus.ACTIVE);
		System.out.println("Local Date: "+openingDate);
		System.out.println("Gaurdian Name: "+gaurdianName);
	}
	
	@Override
	public void withdraw(int pin, int withdrawlimit) {
		// TODO Auto-generated method stub
		super.withdraw(pin, 10000);
	}
}
