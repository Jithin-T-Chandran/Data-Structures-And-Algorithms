/******************************************************************************
Resize Array

*******************************************************************************/
import java.util.*;
public class Main
{   
    static int[] resizeArray(int[] arr,int capacity){
        int[] temp = new int[capacity];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }
	public static void main(String[] args) {
	    int[] arr = new int[]{23,54,7,8,34,6,5};
		System.out.println(Arrays.toString(arr));
	
		System.out.println(Arrays.toString(resizeArray(arr,10)));
	}
}

/**
Output

[23, 54, 7, 8, 34, 6, 5]
[23, 54, 7, 8, 34, 6, 5, 0, 0, 0]

 */
