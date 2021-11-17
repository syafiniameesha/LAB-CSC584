/**
Postlab

a. Create an abstract class named Account for a bank. Include an integer field for the
account number and a double field for the account balance. Also include a constructor
that requires an account number and sets the balance to 0.0. Include a set method for
the balance. Also include two abstract get methods-one for each field.

b. Create two child classes of account: Checking and Savings. Within the Checking
class, the get method displays the String “Checking Account Information”, the account
number, and the balance. Within the Savings class, add a field to hold interest rate, and
require the Savings constructor to accept an argument for the value of the interest rate.
The Savings get method displays the String “Savings Account Information”, the account
number, the balance, and the interest rate.

c. Write a program named AccountArray as driver program in which you enter data for
a mix of 10 Checking and Savings accounts. Use a for loop to display the data.
**/

public abstract class Account{
	public int accNum;
	public double balance;
	
	//constructor
	public Account(int accNum){
		this.accNum = accNum;
		//set balance=0.0
		setBalance(0.0);
	}
	
	//set method for balance
	public void setBalance(double b){
		balance = b;
	}
	
	//get method
	public abstract int getAccNum();
	public abstract double getBalance();
}