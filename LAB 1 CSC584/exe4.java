import javax.swing.JOptionPane;

public class exe4{
	public static void main(String[] args){
		String name = JOptionPane.showInputDialog("What is your name?");
		String age = JOptionPane.showInputDialog("What is your age?");
		
		int newAge = Integer.parseInt(age) ;
		
		JOptionPane.showMessageDialog(null,"Hello "+ name + " Your Age " + newAge ) ;
		System.exit(0) ;
	}
}