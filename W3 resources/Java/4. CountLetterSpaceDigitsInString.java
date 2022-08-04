/******************************************************************************
 Count the letters, spaces, numbers and other characters of an input string
 Hint:
 Methods in Character class is used.
 
 Character.isLetter()
 Character.isDigit()
 Character.isSpaceChar()
 
*******************************************************************************/
import java.util.*;
public class Main
{
    public static void count(String str){
        char[] arr = str.toCharArray();
        int letter =0,space =0,number=0,other=0;
		for(int i=0;i<arr.length;i++){
		    if(Character.isLetter(arr[i])){
		        letter++;
		    }else if(Character.isDigit(arr[i])){
		        number++;
		    }else if(Character.isSpaceChar(arr[i])){
		        space++;
		    }else{
		        other++;
		    }
		}
	 System.out.println("Your string,"+str+"\nContains,\nLetters: "+letter+"\nSpaces: "+space
	 +"\nNumbers: "+number+"\nOther: "+other);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a string");
		String str = sc.nextLine();
		count(str);
		
	}
}
