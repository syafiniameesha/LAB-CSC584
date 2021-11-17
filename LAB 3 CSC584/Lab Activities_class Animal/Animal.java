/**
Polymorphism
Lab activities 

3)Extend the program in exercise 2 by adding two more subclasses of Animal i.e. Snake and
Cat where each has a method speak() which prints “Sss” and “Meow” respectively.

4)Modify the extended program created in Exercise 3 in this lab by creating an array of
superclass objects and manipulate it by invoking the appropriate method for each subclass
member to print the sound of each animal eg. dog, cat, snake and cow.
**/
import java.io.*;
import java.awt.*;

//abstract class Animal
public abstract class Animal {
    //variable field
    private String name;
    
    //normal constructor
    public Animal(String nm) { name=nm; }
    
    //accessor 
    public String getName() { return(name); }
    
    //overriden method
    public abstract void speak();

}