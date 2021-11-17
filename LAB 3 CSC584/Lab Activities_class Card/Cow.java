//class cow
public class Cow extends Animal {
    public Cow(String nm) { super(nm); } //call super class constructor
    
    //overriding method
    public void speak() {
    	//System.out.println("Moo");
        System.out.println(getName() + " sounds Moo");
    }

}