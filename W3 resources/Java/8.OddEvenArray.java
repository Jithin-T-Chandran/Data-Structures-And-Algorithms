
public class Main
{
	public static void main(String[] args) {
		
    String str = "Hai Jithin";
    
    //  Hai         , from index 0 - 3 , 3 is excluded
    System.out.println(str.substring(0,3)); 
    
    
    System.out.println(str.substring(1)); //    ai Jithin


    //For taking last 3 character
     System.out.println(str.substring(str.length() - 3));  //     hin
     
     
     //Check the string startes with "Hai"
     System.out.println(str.startsWith("Hai"));//StringBuffer
     
	}
}
