/******************************************************************************

Polymorphism means "many forms", and it occurs when we have many classes
that are related to each other by inheritance.

Like we specified in the previous chapter; Inheritance lets us inherit attributes
and methods from another class. Polymorphism uses those methods to perform 
different tasks. This allows us to perform a single action in different ways.

If the reference variable of Parent class refers to the object of Child class,
it is known as upcasting. For example:
*******************************************************************************/
class Animal{
    void animalSound(){
        System.out.println("The animal makes a sound");
    }
}
class Cat extends Animal{
    void animalSound(){
        System.out.println("The Cat\'s sound is \"Mew Mew\" ");
    }
}
class Dog extends Animal{
    void animalSound(){
        System.out.println("The Dog\'s sound is \"Bow Bow\" ");
    }
}
public class Main
{
	public static void main(String[] args) {

	    Animal an = new Animal();
	    Animal cat = new Cat();    //upcasting  
	    Animal dog = new Dog();    //upcasting  
	    
	    an.animalSound();
	    cat.animalSound();
	    dog.animalSound();
       // animalSound() method behaves differently in different classes. Or,
       // we can say animalSound() is polymorphic.


	}
}

/******************************************************************************
We can achieve polymorphism in Java using the following ways:

1. Java Method Overriding:
    During inheritance in Java, if the same method is present in both the 
    superclass and the subclass. Then, the method in the subclass overrides the 
    same method in the superclass. This is called method overriding.

2. Java Method Overloading
    we can create methods with the same name if they differ in parameters.

*******************************************************************************/

 //Java Method Overriding:
class Language {
  public void displayInfo() {
    System.out.println("Common English Language");
  }
}

class Java extends Language {
  @Override
  public void displayInfo() {
    System.out.println("Java Programming Language");
  }
}

class Main {
  public static void main(String[] args) {

    // create an object of Java class
    Java j1 = new Java();
    j1.displayInfo();

    // create an object of Language class
    Language l1 = new Language();
    l1.displayInfo();
  }
}

//Java Method Overloading
class Pattern{
    void displayPattern(){
        for (int i=0;i<10;i++){
            System.out.print("*");
        } 
    }
    void displayPattern(char c){
        for (int i=0;i<10;i++){
            System.out.print(c);
        } 
    }
}

public class Main
{
	public static void main(String[] args) {
	    Pattern ob = new Pattern();
	    ob.displayPattern();
	    ob.displayPattern('j');
	}
}

