public class AccountArray
{	//main class
	public static void main(String[] args)
	{
		//array declare
		Account[] accountArray = new Account[10];
		//array data
		accountArray[0] = new Checking(1);
		accountArray[1] = new Checking(2);
		accountArray[2] = new Checking(3);
		accountArray[3] = new Checking(4);
		accountArray[4] = new Checking(5);
		accountArray[5] = new Savings(6, 1.0);
		accountArray[6] = new Savings(7, 1.5);
		accountArray[7] = new Savings(8, 2.0);
		accountArray[8] = new Savings(9, 2.5);
		accountArray[9] = new Savings(10, 2.8);
		
		//for loop
		for(int i = 0; i < accountArray.length; ++i){
			System.out.println(accountArray[i].toString() + "\n");
		}
}}
