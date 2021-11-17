public class Checking extends Account{
	
	public Checking(int accNum)	{
		//super class constructor
		super(accNum);
	}
	
	//override
	public int getAccNum(){
        return accNum;
    }

	public double getBalance(){
        return balance;
    }
    //toString method
    public String toString() {
		return("Checking Account Information\nAccount Number: " 
			+ getAccNum() + "\nBalance: " + getBalance());
	}

}