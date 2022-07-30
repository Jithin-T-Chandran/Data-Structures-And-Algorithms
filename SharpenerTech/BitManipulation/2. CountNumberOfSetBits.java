/******************************************************************************
Input: n = 00000000000000000000000000001011
Output: 3
Explanation: The input binary string 00000000000000000000000000001011
has a total of three '1' bits.

*******************************************************************************/
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        for(int i=0;i<=31;i++){
            if(((n>>i)&1) ==1){
                count++;
            }
        }
        return count;
    }
}