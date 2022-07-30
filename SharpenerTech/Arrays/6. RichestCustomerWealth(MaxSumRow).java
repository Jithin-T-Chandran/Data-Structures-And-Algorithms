/******************************************************************************

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 1+5 = 6
2nd customer has wealth = 7+3 = 10 
3rd customer has wealth = 3+5 = 8
The 2nd customer is the richest with a wealth of 10.

*******************************************************************************/

public class Main
{
    public static int maxSumRow(int[][] arr){
         int max =0;
        for(int i=0;i<arr.length;i++){
          int row =0;
           for(int j=0;j<arr[i].length;j++){
               row+=arr[i][j];
           }
           if(row>max){
               max=row;
           }
        }
        return max;
    }
	public static void main(String[] args) {
		int[][] arr = {{1,5},{7,3},{3,5}};
		System.out.println(maxSumRow(arr));
	}
}
