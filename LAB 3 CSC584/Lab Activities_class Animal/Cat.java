//class cat
public class Cat extends Animal {
    public Cat(String nm) { super(nm); } //call super class constructor
    
    //overriding method
    public void speak() {
    	//System.out.println("Meow");
        System.out.println(getName() + " sounds Meow");
    }

}