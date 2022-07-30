/******************************************************************************
Reversal Algorithm for Array Rotation

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void rotateArray(int[] arr,int d){
        if(d==0){
            return;
        }
        int n = arr.length;
        d=d%n;
        reverseArray(arr,0,n-1);
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
      
    }
    public static void reverseArray(int[] arr,int i,int j){
        while(i<j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
        }
    }
	public static void main(String[] args) {
	   int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
	    rotateArray(arr,3);
		System.out.println(Arrays.toString(arr));
	}
}
//output: [5, 6, 7, 1, 2, 3, 4]