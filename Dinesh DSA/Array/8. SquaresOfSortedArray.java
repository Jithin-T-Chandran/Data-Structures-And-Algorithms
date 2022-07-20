/******************************************************************************
                         Squares of sorted array.
                         
Given an integer array sorted in accending order,return an array of the Squares
of each number sorted in accending order.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int[] squaresOfSortedArray(int[] arr){
      int n = arr.length;
      int i = 0, j = n-1;
      int[] result = new int[arr.length];
      for(int k=n-1;k>=0;k--){
          if(Math.abs(arr[i]) > Math.abs(arr[j])){
              result[k] = arr[i] * arr[i];
              i++;
          }else{
               result[k] = arr[j] * arr[j];
               j--;
          }
      }
      return result;
    }
	public static void main(String[] args) {
	    int[] arr ={-4,-1,0,3,10};
		System.out.println(Arrays.toString(squaresOfSortedArray(arr)));
	}
}
