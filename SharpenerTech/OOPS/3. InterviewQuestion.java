//Accessing Non Static variable/Method Inside Static Method

class Student{
    String name;
    double cgpa;
    
    
    //error: non-static variable cgpa cannot be referenced from a static context
    public static void printDetails(){
        	System.out.println("cgpa "+ cgpa);
    }
}

public class Main
{
	public static void main(String[] args) {
	    Student ob1 = new Student();
	    Student ob2 = new Student();
	    Student ob3 = new Student();
	    ob1.cgpa = 3.4;
	    ob1.cgpa = 7.8;
	    ob1.cgpa = 6.7;
	}
}
