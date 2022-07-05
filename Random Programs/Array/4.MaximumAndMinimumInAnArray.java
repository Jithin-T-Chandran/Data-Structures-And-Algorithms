/******************************************************************************
 * Maximum and Minimum in an Array
Given an array A[ ] of size N containing positive integers, 
find maximum and minimum elements from the array.
*******************************************************************************/
import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
	    System.out.println("Enter number of arrays");
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
		     System.out.println("Enter size of "+(i+1)+" array");
			int N = sc.nextInt();
			int []arr=new int[N];

			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;;
		for(int j = 0;j<N;j++){
		     System.out.println("Enter "+(j+1)+"th Element of"+(i+1)+" array");
			arr[j]= sc.nextInt();
			if(max < arr[j]){
				max = arr[j];
			}
			else if(min > arr[j]){
				min = arr[j];
			}
		}
		System.out.println("Maximum value:"+max+ " "+"Minimum value:"+min);
		}
	}
}