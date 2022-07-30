/******************************************************************************
 Given a positive integer, check whether it has alternating bits: namely, 
 if two adjacent bits will always have different values.

Input: n = 5
Output: true
Explanation: The binary representation of 5 is: 101

Input: n = 7
Output: false
Explanation: The binary representation of 7 is: 111.


Algorithm
---------
1. Find n ^ (n >>> 1)
2. Check if (n ^ (n >>> 1)), all bits are set
3. If all bits set then the given number has bits in alternate pattern else not

eg 1.
if n = 42 => 101010
 (42 >> 1) => 10101
 (42 ^ (42 >> 1)) =>  101010 ^ 010101 => 111111 , so return true
 
eg 2.
if n = 16 => 10000
 (16 >> 1) => 01000
 (16 ^ (16 >> 1)) =>  10000 ^ 01000 => 11000, so return false

*******************************************************************************/

public class Main
{
    public static boolean hasAlternatingBits(int n){
           int num = (n ^ (n >> 1));
           return ((num+1) & num) ==0 ? true : false;
    }
	public static void main(String[] args) {
		System.out.println(hasAlternatingBits(10));
	}
}
