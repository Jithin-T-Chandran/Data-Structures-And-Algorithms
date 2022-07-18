/******************************************************************************

Maximum sum sub array by using Kadane's Algorithm

*******************************************************************************/

public class Main
{
    public static int maxSubArraySum(int[] arr){
        int maxSoFar = arr[0];
        int currentSum = arr[0];
        for (int i=1;i<arr.length;i++){
            currentSum = currentSum + arr[i];
            if(currentSum < arr[i]){
                currentSum = arr[i];
            }
            if(maxSoFar < currentSum){
                maxSoFar = currentSum;
            }
        }
        return maxSoFar;
    }
	public static void main(String[] args) {
	    int[] arr = {4,3,-2,6,-12,7,-1,6};
		System.out.println(maxSubArraySum(arr));
	}
}
