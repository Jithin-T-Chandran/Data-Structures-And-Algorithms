/******************************************************************************
Move zeroes to end of an array while maintaining relative order of the non-zero
elements.
Note:
  1. You can also move any element rather than 0 by just replacing 0 with element 
      in code
  2. You can also move 0's to left
*******************************************************************************/
import java.util.*;
public class Main
{
    static void moveZeroesToEnd(int[] arr,int n){
        int j=0;
        for (int i=0;i<n;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
            }
            if(arr[j]!=0){
                j++;
            }
        } 
    }
	public static void main(String[] args) {
	 int[] arr ={8,1,0,2,1,0,3};
	 moveZeroesToEnd(arr,arr.length);
	 System.out.println(Arrays.toString(arr));
	}
}
