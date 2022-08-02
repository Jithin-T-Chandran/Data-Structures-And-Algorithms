/******************************************************************************
In the case of rotated sorted array,when we divide half,one of them is sorted
So it will go to either left or right of middle and so on.



Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

*******************************************************************************/

public class Main
{
    public static int binarySearch(int[] nums,int target){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end = nums.length-1;
        while (start<=end){
            
            int mid = start+(end-start)/2;
            
            if(nums[mid] == target){
                return mid;
            }
            
            else if(nums[start] <=nums[mid]){
               if(target>=nums[start] && target<=nums[mid]){
                   end = mid-1;
               }else{
                   start =mid+1;
               }
            }else{
                if(target>=nums[mid] && target<=nums[end]){
                   start = mid+1;
               }else{
                   end = mid-1;
               }
            }
            
        }
        return -1;
    }
    
	public static void main(String[] args) {
	    int[] arr = {4,5,6,7,0,1,2};
		System.out.println(binarySearch(arr,0));
	}
}
