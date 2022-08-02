//How to copy values from one object to another?
class A{
    int i;
    int j;
}

public class Main
{
	public static void main(String[] args) {
		
		A ob = new A();
		ob.i =5;
		ob.j =6;
		System.out.println(ob.i+","+ob.j);
		
		//Shallow copy
		A ob1 = ob; //Here no new memory is created,ob1 and ob refers to same memory.
		System.out.println("Shallow copy"+ob1.i+","+ob1.j);
		
		//Deep copy
		A ob2 = new A(); //New oject and memory is created but i and j value is 0;
		System.out.println("Deep copy"+ob2.i+","+ob2.j);
		
		//cloning
		A ob3 = (A)ob.clone(); //New object and memory is created,combination of deep and shallow copy
		System.out.println("cloning"+ob3.i+","+ob3.j);
	}
}
