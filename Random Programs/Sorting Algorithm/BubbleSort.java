/******************************************************************************
           Bubble Sort 
Consider a bucket of bubbles,Large bubbles automatically shift to last positions.
"Every iteration largest element will set as the last"

*******************************************************************************/

import java.util.*;

public class Main
{

    public static int[] bubbleSort(int[] arr,int n){
        int swap=0;
        for (int i=0;i<n-1;i++){
            swap = 0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =  arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }
        return arr;
    }
	public static void main(String[] args) {
		int[] arr = {56,4,90,36,68,23,45,38,67,534,566,7,8,6,45,6,47};
		int n = arr.length;
		System.out.println(Arrays.toString(bubbleSort(arr,n)));
	}
}