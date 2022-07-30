/******************************************************************************

Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58

*******************************************************************************/

public class Main
{
    public static int oddlengthSubArray(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr.length;j++){
               int count=0;
               int tempSum=0;
               for(int k=i;k<=j;k++){
                   count++;
                   tempSum+=arr[k];
               }
               if(count%2 != 0){
                   sum+=tempSum;
               }
           } 
        }
        return sum;
    }
	public static void main(String[] args) {
	    int[] arr = {1,4,2,5,3};
		System.out.println(oddlengthSubArray(arr));
	}
}

