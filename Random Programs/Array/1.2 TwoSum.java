/*
Method 2
Time Complexity: O(n^2) 
Auxiliary Space : O(1) 
*/
import java.util.*;

public class Main
{
    public static int[] twoSum(int[] arr,int t){
        Set<Integer> nums = new HashSet<>();
        for (int i=0;i<arr.length;i++){
        int num1 = arr[i];
        int match = t - num1;
        if(nums.contains(match)){
            return new int[]{num1,match};
        }else{
            nums.add(num1);
        }
        } 
        return new int[]{-1,-1};
    }
	public static void main(String[] args) {
		int[] arr = {6,5,4,3,9,8,0};
		int[] result = twoSum(arr,10);
		if(result.length>0){
		    System.out.println(result[0]+" "+result[1]);
		}
		else{
		      System.out.println("No value");
		}
		
	}
}
