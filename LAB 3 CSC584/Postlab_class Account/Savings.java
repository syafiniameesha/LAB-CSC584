public class Savings extends Account {
	private double interestRate;
	
	public Savings(int accountNumber, double interest) {
		//super class constructor
		super(accountNumber);
		setInterestRate(interest);
	}
	//setter
	public void setInterestRate(double interest) {
		interestRate = interest;
	}
	
	//getter
	public double getInterestRate() {
		return interestRate;
	}
	
	public int getAccNum() {
		return accNum;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		return("Saving Account Information\nAccount Number: " 
			+ getAccNum() + "\nBalance: " + getBalance()
			+ "\nInterest Rate: " + getInterestRate() + "%");
	}
}
