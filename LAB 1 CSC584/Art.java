//import java package 
import java.util.*;
import java.text.DecimalFormat; //used to format numbers using a formatting pattern specify

//create class
public class Art {
	
	private String name;
	private double price;
	DecimalFormat money = new DecimalFormat ("0.00") ;
			
	//mutator method
	public void Art(String name, double price)
			{
				name = name;
				price = price; 
			}
	
	//toString method		
	public String toArtString() 
			{
				return (this.name + " costs " + money.format(price)) ;
			}
			
	//default constructor
	public Art()
			{
				this.name="";
				this.price=0.0;
			}	
	
	//normal constructor 
	public Art(String nm, double p)
			{
				this.name=nm;
				this.price=p;
			}
}
			
