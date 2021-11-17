//main class
public class VariousAnimal {
    
    public static void main(String[] args) {
        
        Animal[] a = new Animal[4];
        a[0] = new Cow("Cow");
        a[1] = new Dog("Dog");
        a[2] = new Snake("Snake");
        a[3] = new Cat("Cat");

        for (int i = 0; i < a.length; i++) {
            a[i].speak();
        }
        
        /**Animal ref;
        
        //object initialization
        Dog aDog = new Dog("Lassie");
        Cow aCow = new Cow("Mabel");
        Snake aSnake = new Snake("");
        Cat aCat = new Cat("");
        
        ref = aCow;
        ref.speak(); //call speak method from cow class
        
        ref = aDog;
        ref.speak(); //call speak method from dog class
        
        ref = aSnake;
        ref.speak(); //call speak method from snake class
        
        ref = aCat;
        ref.speak(); //call speak method from cat class
		}**/
    }

}
