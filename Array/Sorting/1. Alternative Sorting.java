/*
Time Complexity: O(n Log n) 
Auxiliary Space : O(1) 
*/


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		int[] arr = {7,1,2,3,4,5,6};
		Arrays.sort(arr);
		int i=0,n=arr.length,j=n-1;
		while(i<j){
		    System.out.print(arr[j--]+" ");
		    System.out.print(arr[i++]+" ");
		}
		if(n%2!=0){
		  System.out.print(arr[i++]+" ");
		}
		
	}
}
