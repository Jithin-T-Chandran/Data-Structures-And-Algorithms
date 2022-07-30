/******************************************************************************
Algorithm: 
1. Traverse the given array from start to end.
2. For every element in the array increment the arr[i]%n‘th element by n.
3. Now traverse the array again and print all those indexes i for which arr[i]/n
   is greater than 1. Which guarantees that the number n has been added to that index
   This approach works because all elements are in the range from 0 to n-1 and arr[i]
   would be greater than n only if a value “i” has appeared more than once.

 Input : n = 7 and array[] = {1, 2, 3, 6, 3, 6, 1}
 Output: 1, 3, 6

*******************************************************************************/


public class Main
{
    public static void duplicates(int[] arr,int n){
        for(int i=0;i<n;i++){
            arr[arr[i] % n] = arr[arr[i] % n] + n ;
        }
    } 
    static void printDuplicates(int[] arr,int n){
         for(int i=0;i<n;i++){
             if(arr[i] >= n*2){
                 System.out.print( i +" ");
             }
         }
    }
	public static void main(String[] args) {
	    
       int[] arr = {3,2,6,1,3,2};
       int n = arr.length;
       duplicates(arr,n);
       printDuplicates(arr,n);
       
    	
	}
}
/*
 Complexity Analysis: 

 Time Complexity: O(n), Only two traversals are needed. So the time complexity is O(n).
 Auxiliary Space: O(1), No extra space
 
*/

/* ---------------------------------------------------------
Explanation

i=0,
    arr[3%6] = arr[3%6]+6
             = arr[3]+6
             = 1+6 => 7
      arr[3] = 7
        {3,2,6,7,3,2}
        
i=1,
    arr[2%6] = arr[2%6]+6
             = arr[2]+6
             = 6+6 =>12
      arr[2] = 12 
            {3,2,12,7,3,2}
            
i=2,
    arr[12%6] = arr[12%6]+6
              = arr[0]+6
              = 3+6 =>9
       arr[0] = 9 
            {9,2,12,7,3,2}

i=3,
    arr[7%6] = arr[7%6]+6
              = arr[1]+6
              = 2+6 =>8
       arr[1] = 8
            {9,8,12,7,3,2}
            
i=4,
    arr[3%6] = arr[3%6]+6
              = arr[3]+6
              = 7+6 =>13
       arr[3] = 13
            {9,8,12,13,3,2}
i=5,
    arr[2%6] = arr[2%6]+6
              = arr[1]+6
              = 12+6 =>18
       arr[2] = 18
            {9,8,18,13,3,2}
*/
