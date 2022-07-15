/******************************************************************************

To check the given sequence is a subsequence of the string

*******************************************************************************/
import java.util.*;

public class Main
{
    public static boolean isSubsequence(String str,String seq){
       int i=0;
       int j=0;
       
       while(i<str.length() && j<seq.length()){
           if(str.charAt(i) == seq.charAt(j)){
               j++;
           }
           i++;
       }
       
       return j == seq.length();
    }
	public static void main(String[] args) {
		System.out.print(isSubsequence("abcde","ace"));
	}
}