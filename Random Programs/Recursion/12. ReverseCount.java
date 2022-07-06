/******************************************************************************
            Reverse Count
*******************************************************************************/
import java.util.*;

public class Main
{
   public static void reversecount(int n){
       if(n<0){
           return;
       }
       reversecount(n-1);
       System.out.println(n);
   }
	public static void main(String[] args) {
	     reversecount(10);
    }
}
