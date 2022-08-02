/******************************************************************************

 OOPS:
 1. Its a design pattern developer follows. if A develops a code, after A left,
    B also should understand the code of A.
 2. Any change in class attributes of methods also reflected in all objects.
  
Class:
 eg Factory  -> Products.

Inheritance: It can avoid copy pasting the code in one class to another.So in 
  future updates should reflect in every classes. Its very difficult if we copy paste.
 Types of onheritance: 
  1. Multilevel.
  2. Multiple.(Two parents for 1 child, Diamond problem rises here)
  
Polimorphism: 
  1. Compile Time Polimorphism (Method overloading)
  2. Run Time Polimorphism (Method overriding)
  
  for creating an object for class A,
  A obj = new A(); //obj is reference to Heap memory
                   // A => Variable
                   // A() => Constructor
                   // 'new' creates new memory in heap memory
*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
