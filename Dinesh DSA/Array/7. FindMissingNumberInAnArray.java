/******************************************************************************
                Find the missing number in an array

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int findMissingNumber(int[] arr){
       int n = arr.length + 1;
       int sum = n * (n+1)/2;
       for(int num : arr){
           sum = sum - num;
       }
       return sum;
    }
	public static void main(String[] args) {
	    int[] arr ={-4,-1,0,3,10};
		System.out.println(findMissingNumber(arr));
	}
}
