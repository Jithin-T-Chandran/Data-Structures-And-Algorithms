/******************************************************************************
Given an array of integers,return indexes of two numbers such that they added 
upto a specific target.

*******************************************************************************/
//Using HashMap  ( O(n) )
import java.util.*;
public class Main
{   
    static int[] twoSum(int[] arr,int target){
      int[] temp = new int[2];
      Map<Integer,Integer> map = new HashMap<>();
      for (int i=0;i<arr.length;i++){
          if(!map.containsKey(target - arr[i])){
              map.put(arr[i],i);
          }else{
              temp[1] = i;
              temp[0] = map.get(target - arr[i]);
              return temp;
          }
      }
      return temp;
    }
    
	public static void main(String[] args) {
	    int[] arr = new int[]{23,54,7,8,34,6,5};
	    
		System.out.println(Arrays.toString(twoSum(arr,15)));

	}
} 
//Output: [2, 3]


//Using While loop ( O(n) )

import java.util.*;
public class Main
{
    public static int[] twoSum(int[] arr,int target){
        int i = 0;
        int j = arr.length -1;
        Arrays.sort(arr);
        int[] temp = new int[2];
        while(i<j){
            if(arr[i] + arr[j] == target){
                temp[0] = i;
                temp[1] = j;
                return temp;
            }else if(arr[i] + arr[j] < target){
                i++;
            }else{
                j--;
            }
        }
        return new int[]{-1,-1};
    }
    
	public static void main(String[] args) {
		int[] arr = {23,54,7,8,34,6,5};
		System.out.println(Arrays.toString(twoSum(arr,15)));
	}
}

