/******************************************************************************
Given a string of length N, count the number of vowels present at even places.
*******************************************************************************/
import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string: ");
	String str = sc.nextLine();
	int count =0;
	for(int i=0;i<str.length();i++){
	    if((i%2!=0) && (str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
	    str.charAt(i) == 'u')){
	        count++;
	    }
     }
     System.out.println("Count: "+count);
	}
}