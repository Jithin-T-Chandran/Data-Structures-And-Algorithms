/******************************************************************************
*                          Odd sum
Given an array of N integers, your task is to calculate 
the sum of all the odd integers present in the array.

*******************************************************************************/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int N = sc.nextInt();
		int [] arr = new int[N];
		for(int i=0;i<N;i++){
			arr[i] = sc.nextInt();
			if(arr[i]%2 != 0){
			sum = sum + arr[i];
			}
		}
		   System.out.println(Math.floor(sum));  
	}
}