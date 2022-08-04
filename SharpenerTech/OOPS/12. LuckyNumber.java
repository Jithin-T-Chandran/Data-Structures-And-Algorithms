/******************************************************************************
Lucky Number
------------
Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
*******************************************************************************/
import java.util.*;
public class Main
{
   public static int findLucky(int[] arr) {
    
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        int maxKey=-1;
        for (Integer key :map.keySet()){
            if(key == map.get(key) && maxKey < key){
                maxKey = key;
            }
        }
        return maxKey;
        
    }
    
	public static void main(String[] args) {
		int[] arr ={1,2,2,3,3,3};
		System.out.println(findLucky(arr));
	}
}
