//class Snake
public class Snake extends Animal {
    public Snake(String nm) { super(nm); } //call super class constructor
    
    //overriding method
    public void speak() {
    	//System.out.println("Sss");
        System.out.println(getName() + " sounds Sss");
    }

}