/******************************************************************************
                                Two Sum

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int[] twoSum(int[] arr,int target){
        int[] temp = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target -arr[i])){
                temp[0]=i;
                temp[1]=map.get(target -arr[i]);
                return temp;
            }else{
                map.put(arr[i],i);
            }
        }
        return new int[]{-1,-1};
    }
    
	public static void main(String[] args) {
		int[] arr ={5,3,8,7,23,45,6};
		System.out.println(Arrays.toString(twoSum(arr,13)));
	}
}
