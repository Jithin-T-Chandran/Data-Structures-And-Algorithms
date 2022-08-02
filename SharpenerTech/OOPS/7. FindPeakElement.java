//Concept Binary Search
/******************************************************************************
Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak 
element is 2, or index number 5 where the peak element is 6.
*******************************************************************************/

public class Main
{
    public static int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length -1;
        int n = arr.length;
        while(start <= end){
            int mid = start +(end - start)/2;
            if((mid==0 || arr[mid-1]<= arr[mid]) && (arr[mid] >= arr[mid+1] || mid == n-1) ){
                return mid;
            }else if(mid>0 && arr[mid-1] > arr[mid]){
                 end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    
	public static void main(String[] args) {
	    int[] arr = {1,2,1,3,5,6,4};
		System.out.println(binarySearch(arr));
	}
}


//Another method
 public static int binarySearch(int[] nums){
        int start=0;
        int end = nums.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end = mid;
            }
            else {
                start = mid+1;
            }
            
        }
        return start;
    }