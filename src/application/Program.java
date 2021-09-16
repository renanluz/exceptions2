package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double intialBalance = sc.nextDouble();
		System.out.print("WithdrawLimit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, intialBalance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		try {
			account.withdraw(amount);		
			System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		sc.close();
	}
}
