/******************************************************************************
Input: nums = [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2; 
The number 2 can't find next greater number. 
The second 1's next greater number needs to search circularly, which is also 2.


Input: nums = [1,2,3,4,3]
Output: [2,3,4,-1,4]
*******************************************************************************/
import java.util.*;
public class Main
{
    
    public static int[] nextGreaterElements(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr,-1);
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<nums.length * 2;i++){
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i%nums.length]){
                arr[stack.pop()] = nums[i%nums.length];
            }
            if(i<nums.length){
                stack.add(i);
            }
        }
        return arr;
    }
	public static void main(String[] args) {
	    int[] nums ={1,2,3,4,3};
		System.out.println(Arrays.toString(nextGreaterElements(nums)));
	}
}
