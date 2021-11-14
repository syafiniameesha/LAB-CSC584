import java.io.*;
public class Camera{
	
	//constant
	final int digital = 1;
	final int film = 2;
	
	//double data field
	double resolution;
	
	//int data field
	int price;
	
	//boolean data field
	boolean isFlash = false;
	
	//string data field
	String name;
	
	//default constructor
	public Camera(){
		name = "";
		resolution = 0.0;
		price = 0;
		isFlash = false;
	}
	
	//mutator
	public void n(String n) { name = n; }
	public void r(double r) { resolution = r; }
	public void p(int p) { price = p; }
	public void isFlashOn(boolean isFlashOn) { isFlash = isFlashOn; }
	
	//accessor
	public String getName() { return name; }
	public double getResolution() { return resolution; }
	public int getPrice() { return price; }
	public boolean getIsFlash() { return isFlash; }
	
	//toString method
	public String toString()
		{
			return ("Price = RM" + price + "\nImage resolution = " 
				+ resolution + "\nName = " + name);
		} 
}