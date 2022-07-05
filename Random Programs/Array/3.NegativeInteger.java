/******************************************************************************
Given an array of N integers, check if it contains any negative integer.
*******************************************************************************/

import java.io.*; 
import java.util.*; 


class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int[N];
		boolean val = false;
		for(int i=0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<N;i++){
			if(arr[i]< 0){
				val = true;
				break;
			}
		}
		if(val){
			System.out.print("Yes");
		}
		else{
			System.out.print("No");
		}
}
}