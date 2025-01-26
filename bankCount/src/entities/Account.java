package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double balance) {
		this.balance += balance;
	}
	
	public void withdraw(double balance) {
		this.balance -= balance + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ number 
				+", "
				+"Holder: "
				+ holder
				+", "
				+"Balance: "
				+ balance;
				
	}

}
