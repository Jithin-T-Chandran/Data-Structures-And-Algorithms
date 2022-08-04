/******************************************************************************
Input: s = "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent
and equal, and this is the only possible move.  The result of this move is that 
the string is "aaca", of which only "aa" is possible, so the final string is "ca".
*******************************************************************************/
import java.util.*;
public class Main
{
    
    public static String removeAdjustant(String s){
        Stack<Character> st = new Stack<Character>();
        for (int i=0;i<s.length();i++){

            if(!st.isEmpty() && s.charAt(i) == st.peek()){
                st.pop();
            }else{
                st.add(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.empty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
        
    }
  
	public static void main(String[] args) {
		System.out.println(removeAdjustant("azxxzy"));
	    
	}
}
