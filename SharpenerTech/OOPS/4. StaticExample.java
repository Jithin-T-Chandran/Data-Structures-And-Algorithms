//Static variable example
/*

You can use static constructor as

static{

    //code 
}

static constructor vs normal constructor
----------------------------------------
static constructor: when you load a class
constructor: when you create an object

*/



class Student{
   int id;
   
   //college name is static
   static String collegeName;
    
    public void printDetails(){
        	System.out.println("id "+id+"\nCollege name "+collegeName);
    }
}

public class Main
{
	public static void main(String[] args) {
	    Student ob1 = new Student();
	  
	    ob1.id = 1;
	    ob1.collegeName = "NSS"; //It will reflected to all the objects
	    ob1.printDetails();
	    
	    Student ob2 = new Student();
	    System.out.println("Ob 2 "+ob2.collegeName); //it prints NSS
	    
	    ob2.collegeName = "TKM"; // static variable is updated to TKM
	    System.out.println("Ob 2 "+ob2.collegeName); //it prints TKM
	    System.out.println("Ob 1 "+ob1.collegeName); //it prints TKM
	    
	    
	    
	    
	    // static variable can be changed using class name
        // we don't need object
	    Student.collegeName ="Finish";
	    System.out.println("End here "+Student.collegeName); //it prints Finish
	}
}
