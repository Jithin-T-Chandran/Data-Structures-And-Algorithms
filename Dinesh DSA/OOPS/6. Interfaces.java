/******************************************************************************
Interfaces:
 * Another way to achieve abstraction in Java, is with interfaces.
 * An interface is a completely "abstract class" that is used to group related 
   methods with empty bodies:
 * To access the interface methods, the interface must be "implemented" (kinda 
   like inherited) by another class with the implements keyword (instead of extends).
   The body of the interface method is provided by the "implement" class:


 * Like abstract classes, interfaces cannot be used to create objects 
 * Interface methods do not have a body - the body is provided by the "implement" class
 * On implementation of an interface, you must override all of its methods
 * Interface methods are by default abstract and public
 * Interface attributes are by default public, static and final
 * An interface cannot contain a constructor (as it cannot be used to create objects)
*******************************************************************************/

interface Animal{
    public void animalSound();
    public void sleep();
}
class Dog implements Animal{
    public void animalSound(){
         System.out.println("Dog says: Bow! Bow!");
    }
    public void sleep(){
          System.out.println("Zzz");
    }
}
public class Main
{
	public static void main(String[] args) {
		Dog ob = new Dog();
		ob.animalSound();
		ob.sleep();
	}
}


//Multiple Interfaces
//To implement multiple interfaces, separate them with a comma:
interface FirstInterface{
    public void firstMethod();
}

interface SecondInterface{
    public void secondMethod();
}

class Demo implements FirstInterface, SecondInterface {
     public void firstMethod(){
         System.out.println("Message from first method");
     }
     public void secondMethod(){
         System.out.println("Message from second method");
     }
}
public class Main
{
	public static void main(String[] args) {
	Demo ob = new Demo();
	ob.firstMethod();
	ob.secondMethod();
	}
}
