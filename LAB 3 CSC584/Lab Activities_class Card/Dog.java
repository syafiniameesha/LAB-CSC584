//class dog
public class Dog extends Animal {
    public Dog(String nm) { super(nm); } //call super class constructor
    
    //overriding method
    public void speak() {
    	//System.out.println("Woof");
        System.out.println(getName() + " sounds Woof");
    }

}