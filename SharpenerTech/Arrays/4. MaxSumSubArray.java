


public class Main
{
    public static int kadanesAlgo(int[] arr){
        int currentSum = arr[0];
        int maxSum = arr[0];
        
        for(int i=0;i<arr.length;i++){
            currentSum+=arr[i];
            if(currentSum<arr[i]){
                currentSum = arr[i];
            }
            if(maxSum<currentSum){
               maxSum=currentSum; 
            }
        } 
        return maxSum;
        
    }
    
	public static void main(String[] args) {
	    int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(kadanesAlgo(arr));
	}
}
//output: 7