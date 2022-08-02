/******************************************************************************
Quick Sort
*Its a divide an conquer Algorithm,It contains 3 steps
 i. select pivot element
 ii. Partitioning: elements greater than pivot, right.
                   elements lesser than pivot, left
                   elements equal to pivot go to either side
     After partitioning pivot will be at correct position
iii. Recursion: Recursion applied to left and right side of pivot. 

*******************************************************************************/
import java.util.*;
public class Main
{
    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
    
    public static void quickSortHelper(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int pivot = start;
        int left = start + 1;
        int right = end;
        while(left <= right){
            if(arr[left] > arr[pivot] && arr[right] < arr[pivot]){
                swap(arr,left,right);
                left++;
                right--;
            }
            
            if(arr[left] <= arr[pivot]){
                 left++;
             }
             
            if(arr[right] >= arr[pivot]){
                 right--;
             }
        }
        swap(arr,right,pivot);
        quickSortHelper(arr,start,right-1);
        quickSortHelper(arr,right+1,end);
    }

    public static int[] quickSort(int[] arr){
        quickSortHelper(arr,0,arr.length-1);
        return arr;
    }
    
	public static void main(String[] args) {
	    int[] arr = {7,34,547,364,53,56,73,46};
		System.out.println(Arrays.toString(quickSort(arr)));
	}
}
//Time complexity => O(nlogn)
//Space complexity => O(logn)
