/******************************************************************************

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int numJewelsInStones(String jewels, String stones) {
          HashSet<Character> set = new HashSet<>();
          int count=0;
          for (Character c : jewels.toCharArray() ) {
              set.add(c);
          }
          for (Character c : stones.toCharArray() ) {
              if(set.contains(c)){
                  count++;
              }
              
          }
          return count;
    }
  
	public static void main(String[] args) {
		System.out.println(numJewelsInStones("aA","aAAbbbb"));
	    
	}
}
