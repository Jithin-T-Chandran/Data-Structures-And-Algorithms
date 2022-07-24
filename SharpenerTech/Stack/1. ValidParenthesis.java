/******************************************************************************

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

An input string is valid if:

1.Open brackets must be closed by the same type of brackets.
2.Open brackets must be closed in the correct order.

*******************************************************************************/
//Method 1 (stack only) 
import java.util.*;
public class Main
{
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c=='('){
                st.push(')');
            }
            else if(c=='{'){
                st.push('}');
            }
            else if(c=='['){
                st.push(']');
            }
            else if(s.isEmpty() || c != st.pop()){
               return false;
            }
        }
        return st.isEmpty();
    }
	public static void main(String[] args) {
		
        System.out.println(isValid("(({{}}))"));
	}
}



//Method 2 (stack and hashmap) 
import java.util.*; 
public class Main
{
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<Character>();
        Map<Character,Character> map = new HashMap<Character,Character>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                st.add(c);
            }else if(st.isEmpty() || c!= map.get(st.pop())){
                return false;
            }
        }
        return st.isEmpty();
        
    }
	public static void main(String[] args) {
		System.out.println(isValid("(({(}))"));
	}
}
