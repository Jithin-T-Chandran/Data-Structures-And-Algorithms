/*
Method 1
Time Complexity: O(n^2) 
Auxiliary Space : O(1) 
*/


public class Main
{
    public static int[] twoSum(int[] arr,int t){
        for (int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==t){
                    int[] res ={i,j};
                    return res;
                }
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

