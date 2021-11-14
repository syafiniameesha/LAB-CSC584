import javax.swing.JOptionPane;

public class exe6{
	public static void main(String[] args){
		//Input num from user
		String a = JOptionPane.showInputDialog("Insert integer 1:");
		String b = JOptionPane.showInputDialog("Insert integer 2:");
		String c = JOptionPane.showInputDialog("Insert integer 3:");
		
		//change input from string to int
		int integer1 = Integer.parseInt(a);
		int integer2 = Integer.parseInt(b);
		int integer3 = Integer.parseInt(c);
		
		//declare
		int sum, product, avg;
		
		//calculation
		sum = integer1 + integer2 + integer3;
		product = integer1*integer2*integer3;
		avg = sum/3;
		
		//display output
		JOptionPane.showMessageDialog(null,"The numbers are "+ integer1 + "," 
			+ integer2 + "," + integer3 + "\nThe sum is " + sum
			+ "\nThe product is " + product + "\nThe average is " + avg);
		System.exit(0) ;
	}
}

