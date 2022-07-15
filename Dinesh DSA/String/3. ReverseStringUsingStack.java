//Using only Stack
import java.util.*;
public class Main
{
    public static void reverse(String str){
        Stack<Character> st = new Stack<Character>();
        for (int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }
        for (int i=0;i<str.length();i++){
            System.out.print(st.pop()+" ");
        } 
    }
	public static void main(String[] args) {
		reverse("Jithin");
	}
}

//Using only Stack And Array
import java.util.*;

public class Main
{
    public static String reverse(String str){
        Stack<Character> st = new Stack<Character>();
        char[] arr = str.toCharArray();
        for(char c : arr){
            st.push(c);
        }
        for (int i=0;i<str.length();i++){
            arr[i] = st.pop();
        }
        return new String(arr);
    }
	public static void main(String[] args) {
		System.out.print(reverse("Jithin"));
	}
}