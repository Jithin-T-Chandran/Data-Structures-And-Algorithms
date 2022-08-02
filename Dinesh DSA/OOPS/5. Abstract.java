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
   
ii.Abstract method: 
   *its declared but not defined
  can only be used in an abstract class, and it does not have
   a body. The body is provided by the subclass (inherited from).

   *Abstract methods are declared in abstract classed.
   *Cannot create object of abstract class( only inheritance works here) 
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













//Another example for abstract class and abstract method

abstract class Mahesh{ //abstract class
    void call(){
        System.out.println("calling");
    }
    abstract void move(); //abstract methods
    abstract void dance();
    abstract void cook();
}
abstract class Ramesh extends Mahesh{
    void move(){
        System.out.println("moving");
    }
}
class Suresh extends Ramesh{            //concrete class

    void dance(){
        System.out.println("dancing");
    }
    void cook(){
        System.out.println("cooking");
    }
}
public class Main
{
	public static void main(String[] args) {
		Mahesh ob = new Suresh();  //Cant instantiate abstract class
		ob.call();
		ob.move();
		ob.dance();
		ob.cook();
	}
}





//Example 3
abstract class Phone{
    abstract void showConfig();
}
class Iphone extends Phone{
    void showConfig(){
        System.out.println("6 GB IOS");
    }
}
class Android extends Phone{
    void showConfig(){
        System.out.println("8 GB Pie");
    }
}

public class Main
{
    //Instead of creating two methods with 2 different parametres, 
    //Abstract class Phone is used for Iphone & Android
  
    public static void show(Phone ob){
        ob.showConfig();
    }
  
  
   /* public static void show(Iphone ob){
        ob.showConfig();
    }
    public static void show(Android ob){
        ob.showConfig();
    }*/
    
	public static void main(String[] args) {
	Iphone ob1 = new Iphone();
	Android ob2 = new Android();
	show(ob1);
	show(ob2);
	
	
	}
}
