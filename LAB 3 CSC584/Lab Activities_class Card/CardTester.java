abstract class Card {
     String recipient;
     public abstract void greeting(); }
/**
 Lab activities Question 1
**/

//class holiday    
class Holiday extends Card {
	
	public Holiday(String r) { recipient=r; }
	public void greeting() {
		System.out.println("Dear " + recipient + ",\n");
	    System.out.println("Season's Greeting!\n\n");
	}
}
//Question 1b
//class birthday
/**class Birthday extends Card {
    int age;
    public Birthday(String r, int years) {
        recipient = r;
        age = years; 
     }
    public void greeting(){
        System.out.println("Dear "+ recipient + ",\n");
        System.out.println("Happy "+ age + "th Birthday\n\n"); 
    }

}**/

//main class
public class CardTester {
    public static void main(String[] args) {
    	Holiday hol = new Holiday("Santa");
    	hol.greeting();
        
        //Question 1c
        //Birthday bd = new Birthday("Maria", 21);
        //bd.greeting();
        
        /** Question 1e
        Card card = new Holiday("Amy"); 
        card.greeting(); //invoke holiday greeting()
        
        card = new Birthday ("Cindy",17); 
        card.greeting(); //invoke birthday greeting()**/
	}
}



