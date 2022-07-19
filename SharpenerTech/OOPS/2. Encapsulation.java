/******************************************************************************
Modifiers: 
1. Access Modifiers
i.   public:	The code is accessible for all classes.
ii.  private:   The code is only accessible within the declared class
iii. default:	The code is only accessible in the same package.(its the default) 
iv.  protected:	The code is accessible in the same package and subclasses.

2. Non-Access Modifiers
i.  final:   	The class cannot be inherited by other classes.
ii. abstract	The class cannot be used to create objects (To access an
                abstract class, it must be inherited from another class.)


Encapsulation : "sensitive" data is hidden from users.
         declare class variables/attributes as private & provide public get and 
         set methods to access and update the value of a private variable


Package: used to group related classes
i.  Built-in Packages (packages from the Java API)
ii. User-defined Packages (create your own packages)

The library is divided into packages and classes. Meaning you can either import 
a single class (along with its methods and attributes), or a whole package that 
contain all the classes that belong to the specified package.
*******************************************************************************/

class Car{
    
    String color;
    private int weight;
    
    Car(){
        this.color = "white";
        this.weight = 1500;
    }
 
    void drives(){
        System.out.println(color+" car drives");
    }
    void breaks(){
        System.out.println(weight+"kg car breaks");
    }
    
    
    //set method
    void setWeight(int weight){
        this.weight = weight;
    }
    //set method
    int getWeight(){
        return weight;
    }
}
class Main
{
	public static void main(String[] args) {
		Car ob1 = new Car();
		
	//	System.out.println(ob1.weight); // error: weight has private access in Car
	    
	    //accessing private variable 
	    System.out.println(ob1.getWeight()); 
	    ob1.setWeight(2300);
	    System.out.println(ob1.getWeight());
	    
	}
}
