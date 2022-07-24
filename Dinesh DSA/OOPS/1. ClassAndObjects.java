/******************************************************************************
* For example: in real life, a car is an object. The car has attributes, such as
  weight and color, and methods, such as drive and brake.
  
* A Class is like an object constructor, or a "blueprint" for creating objects.

* If you don't want the ability to override existing values,
  declare the attribute as final
  (if "final int weight", "ob1.weight = 234 can't be override")

* static method, which means that it can be accessed without creating an
   object of the class
* public method, which can only be accessed by objects:

*******************************************************************************/
class Car{
    
    //Attributes, class attributes are variables within a class:
    public String color;
    public int weight;
    
    //constructor, is a special method that is used to initialize objects.
    Car(){
        this.color = "white";
        this.weight = 1500;
    }
    Car(String color,int weight){
        this.color = color;
        this.weight = weight;
    }
    //methods
    void drives(){
        System.out.println(color+" car drives");
    }
    void breaks(){
        System.out.println(weight+"kg car breaks");
    }
}
class Main
{
	public static void main(String[] args) {
		Car ob1 = new Car();
	//	System.out.println(ob1.weight);
	//ob1.drives();
	ob1.breaks()
	}
}
