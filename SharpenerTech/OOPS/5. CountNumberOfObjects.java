//Destructors => Free the space that we don't required


class Student{



    //important
    static int count =0;
    {
        //counts the object created
        count++;
    }
    




    void print(){
        System.out.println("hai");
    }
   
}

public class Main
{
	public static void main(String[] args) {
	Student s1 = new Student();
	Student s2 = new Student();
	Student s3 = new Student();
	Student s4 = new Student();
	Student s5 = new Student();
	Student s6 = new Student();
	
	//System.out.println(s1.count);
	System.out.println(Student.count); //6
	}
}
