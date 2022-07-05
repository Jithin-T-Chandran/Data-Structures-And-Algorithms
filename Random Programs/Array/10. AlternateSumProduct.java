/******************************************************************************
Alternate Sum product

Given an array Arr of N integers, your task is to print the sum of elements 
present at even places and print the product of elements present at the odd places.

Note:- Consider the first element to start from 1.
*******************************************************************************/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int[N];
		for(int i=0;i<N;i++){
			arr[i] = sc.nextInt();
		}
        int even=0, odd=1;
		for(int i=0;i<N;i++){
			if((i+1)%2==0){
                even = even + arr[i];
            }
            else{
                odd = odd * arr[i];
            }
		}
        System.out.print(even + " " + odd);
	}
}