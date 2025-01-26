package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account conta1; 
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		double balance;
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Enter Initial deposit value: ");
			balance = sc.nextDouble();
			conta1 = new Account(number, holder, balance);
		}else {
			conta1 = new Account(number, holder);
		}
		
		
		System.out.println();
	
		System.out.println("Account data: ");
		System.out.println(conta1);
		System.out.print("Enter a deposit value: ");
		balance = sc.nextDouble();
		conta1.deposit(balance);
		
		System.out.println("Update account data: ");
		System.out.println(conta1);
		
		System.out.print("Enter a withdraw value: ");
		balance = sc.nextDouble();
		conta1.withdraw(balance);
		
		System.out.println("Update account data: ");
		System.out.println(conta1);
		
		sc.close();
	}

}
