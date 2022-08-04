/******************************************************************************
Reverse a string
array is used
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a string");
		char[] arr = sc.nextLine().toCharArray();
		for(int i=arr.length-1;i>=0;i--){
		    System.out.print(arr[i]+"");
		}
	}
}
