/******************************************************************************
* Java Inner Classes: group classes that belong together, which makes your code 
  more readable and maintainable.

* To access the inner class, create an object of the outer class, and then 
  create an object of the inner class:
* One advantage of inner classes, is that they can access attributes and
  methods of the outer class
  
  
  Abstraction:
* Data abstraction is the process of hiding certain details and showing only 
  essential information to the user.
* Abstraction can be achieved with either abstract classes or interfaces

i. Abstract class: is a restricted class that cannot be used to create objects 
   (to access it, it must be inherited from another class).
   
ii.Abstract method: can only be used in an abstract class, and it does not have
   a body. The body is provided by the subclass (inherited from).
*******************************************************************************/

//Example of Inner class and Outer class
class OuterClass{
    int x = 5;
    
    class InnerClass{
        int y = 10;
    }
}
public class Main
{
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass(); //important
	
		//If inner class is static,
		//OuterClass.InnerClass inner = new OuterClass.InnerClass();
		
		System.out.println("Outer class value "+outer.x);
		System.out.println("Inner class value "+inner.y);
	}
}

/*******************************| Abstract Example |***************************/

// Abstract class
abstract class Animal{
    // Abstract method (does not have a body)
    public abstract void animalSound();
    
    // Regular method
    public void sleep(){
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Dog extends Animal{
    // The body of animalSound() is provided here
    public void animalSound(){
         System.out.println("Dog says: Bow! Bow!");
    }
}

public class Main
{
	public static void main(String[] args) {
		Dog ob = new Dog(); // Create a Dog object
		ob.animalSound();
		ob.sleep();
	}
}

