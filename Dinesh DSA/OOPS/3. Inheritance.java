/******************************************************************************

 Inherit attributes and methods from one class to another.
 subclass (child) - the class that inherits from another class
 superclass (parent) - the class being inherited from

 If you don't want other classes to inherit from a class, use the final keyword:

*******************************************************************************/
class Vehicle{
    protected String brand = "Suzuki";       // Vehicle attribute
    public void honk() {                     // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle{
    protected String modelName = "Alto";     // Car attribute
}


public class Main
{
	public static void main(String[] args) {
		Car myCar = new Car();
		
		 // Display the value of the brand attribute (from the Vehicle class) 
		 //and the value of the modelName from the Car class
		System.out.println(myCar.modelName + " " + myCar.brand);
		
		
		 // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();
	}
}
