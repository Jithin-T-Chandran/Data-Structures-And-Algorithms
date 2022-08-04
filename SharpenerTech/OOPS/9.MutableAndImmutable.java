/******************************************************************************
* String vs StringBuilder vs StringBuffer in Java
 String is immutable and StringBuilder,StringBuffer are mutable
* StringBuilder is faster and preferred over StringBuffer for the single-threaded
 program. If thread safety is needed, then StringBuffer is used. 
 
 
String Builder: Not thread safe
String Buffet: Thread save


*******************************************************************************/
public class Main
{
    //String
    public static void concat1(String s1){
        s1 = s1+ " T Chandran";
    }
    
    //String Builder
    public static void concat2(StringBuilder s2){
        s2.append(" T Chandran");
    }
    
    //String Buffer
    public static void concat3(StringBuffer s3){
       s3.append(" T Chandran");
    }
	public static void main(String[] args) {
		String s1 = "Jithin";
		concat1(s1);
		//String is immutable
		System.out.println("String: "+s1);
		
		
		StringBuilder s2 = new StringBuilder("Jithin");
		
		//StringBuilder is mutable
		concat2(s2);
		
		System.out.println("String Builder: "+s2);
		
		
	    StringBuffer s3 = new StringBuffer("Jithin");
	    //StringBuffer is mutable & thread-safe
		concat3(s3);
		System.out.println("String Builder: "+s3);
	}
}

/******************************************************************************
Conversion between types of strings in Java

1. From String to StringBuffer and StringBuilder
2. From StringBuffer and StringBuilder to String
3. From StringBuffer to StringBuilder or vice-versa

*******************************************************************************/

//1. From String to StringBuffer and StringBuilder
class Main{
    
    public static void main (String[] args) {
        String str = "Jithin";
        
        //String to StringBuilder
        StringBuilder sb1 = new StringBuilder(str);
        System.out.println(sb1.reverse());
        
        //String to StringBuffer
        StringBuffer sb2 = new StringBuffer(str);
          System.out.println(sb2.append(" T Chandran"));
    }
}

//2. From StringBuffer and StringBuilder to String

        //* toString() method is used
        //*  a new String object(in Heap area) is allocated and initialized
class Main{
    
    public static void main (String[] args) {
         StringBuilder sb1 = new StringBuilder("This is String Builder");
         StringBuffer sb2 = new StringBuffer("This is String Buffer");
         String str1 = sb1.toString();
         String str2 = sb2.toString();
        
        
        System.out.println("str1 = "+str1);
        System.out.println("str2 = "+str2);
    }
}

//Case 3: From StringBuffer to StringBuilder or vice-versa

//There is no direct way to convert the same. In this case, We can use a String 
 //first convert the StringBuffer/StringBuilder object to String using toString() 
 //method and then from String to StringBuilder/StringBuffer using constructors.