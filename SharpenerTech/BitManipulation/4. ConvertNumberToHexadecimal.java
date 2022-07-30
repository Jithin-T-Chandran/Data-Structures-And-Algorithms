/******************************************************************************
eg n = 92.

16 |92  rem => 12
   ---
16 | 5  rem => 5
   ---
    0
So, 5C   where  C = 12.

                        *Hexadecimal to decimal => (16^1 * 5) + (16^0 * 12) = 92 
-------------------------------------------------

For negative number to binary, 2's complement of positive number.
2's complement =  1's complement + 1
1's complementmt = negation of positive number.

eg -9.
in 32 bits 9 represented 
 0000...1001
 negation => 1111...0110
 adding 1 to it => 1111...0111 => (-9)
 
 For negative number to hexadecimal,
 memory occupied => 2^32 = 16^8
 ie, 92 => 0000005C (positive number to hexadecimal)
 for -92 => ? 1's complement + 1
      F - digit.  + 1
        => FFFFFFA3  + 1
        => FFFFFFA4
*******************************************************************************/

public class Main
{   
    public static String decimalToHexa(int num){
        int n = Math.abs(num);
        char[] hexaValue = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
        String s="";
        
        while(n>0){
             rem =  n%16;
             s=hexaValue[rem]+s;
             n=n/16;
        }
        
        
        
        
        return s;
        
    }
	public static void main(String[] args) {
		System.out.println(decimalToHexa(92));
	}
}
/*

For example, num = 4012
Step 1) What is 4012 in binary number?
00000000000000000000111110101100

Step 2) How to convert a binary to hex presentation? We separate the binary in 8 groups, each group has 4 bits.
0000 0000 0000 0000 0000 1111 1010 1100

Step 3) We create a while loop to read 4 bits each time. Since it's a 32-bit Integer, we can only execute this while loop 8 times. We also want to exit the while loop if the num is 0.
while (loopCount < 8 && num != 0)

Step 4) How to read 4 bits each time?
We can use & operation. 15 in binary is 1111. If we do num & 15, it will give you the last four bits.
num & 15 will give you the number in range [0...15], we can use this to map to the hexChar array.
0 -> 0 ....9 -> 9....10 -> a....15 -> f
After each loop, we need to remove the last 4 bits. num = num >> 4, and also increment the loopCount by 1.

This apporach can also handle the negative case.
For example -1 in binary is 1111 1111 1111 1111 1111 1111 1111 1111. We just apply the same logic above.
*/
class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        char[] hex = 
            new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder strBuilder = new StringBuilder();
        int count = 0;
        while (count < 8 && num != 0) {
            strBuilder.append(hex[num & 15]);
            num = num >> 4;
            count++;
        }
        return strBuilder.reverse().toString();
    }
}