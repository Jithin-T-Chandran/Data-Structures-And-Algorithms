/******************************************************************************
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
*******************************************************************************/
import java.util.*;

public class Main
{
    public static int[] runningSum(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
            arr[i]=sum;
        } 
        return arr;
    }
	public static void main(String[] args) {
	
	int[] arr = {1,1,1,1,1,1,1,1,1,1};
	System.out.println(Arrays.toString(runningSum(arr)));
	}
}
