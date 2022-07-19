/******************************************************************************
                            Reverse an array
*******************************************************************************/
import java.util.*;
public class Main
{   
    static void reverseArray(int[] arr,int n){
      int start = 0;
      int end = n-1;
      while(start < end){
          int temp   = arr[start];
          arr[start] = arr[end];
          arr[end]   = temp;
          start++;
          end--;
      }
    }
	public static void main(String[] args) {
	    int[] arr = new int[]{23,54,7,8,34,6,5};
	    
		System.out.println(Arrays.toString(arr));
	    reverseArray(arr,arr.length);
	    System.out.println(Arrays.toString(arr));
	}
}
