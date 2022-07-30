/******************************************************************************

1 Byte = 8 bits (0's or 1's)
int carries 4 byte => 32 bits => (0's or 1's)=> 2^32 

lEFT SHIFT
----------
10101 << 2  => 1010100

RIGHT SHIFT
----------
10101 >> 2  => 101


*******************************************************************************/

// Q. An array containing 2*n + 1 elements with n repeating elements. Find nonRepeating element


//Brute Force Approach
public class Main
{
    public static int nonRepeating(int[] arr){
        for (int i=0;i<arr.length ;i++ ){
            int count=0;
                for (int j=0;j<arr.length ;j++ ){
                    if(arr[i] == arr[j]){
                            count++;
                    }
                
                }
            if(count==1){
                return arr[i];
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	    int[] arr = {1,7,34,78,75,342,78,234,34,234,1,7,75};
		System.out.println(nonRepeating(arr));
	}
}
//Time Complexity: O(n^2)




//Using XOR operation
public class Main
{
    public static int nonRepeating(int[] arr){
        int sum =0;
        for (int i=0;i<arr.length ;i++ ){
           sum= sum  ^ arr[i];
        }
        return sum;
    }
	public static void main(String[] args) {
	    int[] arr = {1,7,34,78,75,342,78,234,34,234,1,7,75};
		System.out.println(nonRepeating(arr));
	}
}
//Time Complexity: O(n)

/******************************************************************************
                                  Node:  set means 1 and unset means 0;
RIGHT SHIFT
----------
10101
To find 3rd bit is set or unset, right shift to n-1 times(here n=3,so 3-1) and apply
AND operation, if its 1 then set else unset

lEFT SHIFT
----------
To set a bit in given position
eg 10000,    to set 1 to 3rd position, apply left shit n-1 times (here n=3,so 3-1)
to 1 so 100. Apply OR operation => 10000 OR 100 => 10100
*******************************************************************************/