/**
 	Lab Activities Question 2
	What will happen when you attempt to compile and run the following code? Fix the errors.
**/	
class Animal
{
	//private String hairColor; error here, superclass cant use private
	protected  String hairColor;
	
	public Animal(){hairColor = "unknown";}
	
	public Animal(String hc) {hairColor = hc;}
	
	public String getHairColor() {return hairColor;}
	
	public String toString() {return "I am an Animal with " + hairColor + " hair color.";}
}

class Cat extends Animal
{
	protected int tagNumber;
	Cat() 
		{
			
			if(hairColor.equals("unknown"))
			{hairColor = "brown";}
		}
		
	public int getTagNumber() {return tagNumber;}
	public String toString() 
		{
			return ("I am a Cat with " + getHairColor() + " hair color and tag number "
			+ tagNumber);
		}
	//include main class
	public static void main (String[] args) {
		//object intialization
		Animal a = new Animal();
		Cat c = new Cat();
		//display output
		System.out.println(a.toString());
		System.out.println(c.toString()); //call toString method
	}
}