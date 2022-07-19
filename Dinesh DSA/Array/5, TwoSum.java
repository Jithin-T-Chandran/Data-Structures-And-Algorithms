/******************************************************************************
Given an array of integers,return indexes of two numbers such that they added 
upto a specific target.

*******************************************************************************/
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


/* 
    Output: [2, 3]
*/
