import java.util.*;
public class Main
{
    
    public static boolean palindrome(String str){
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            if(arr[start] != arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
	public static void main(String[] args) {
		System.out.println(palindrome("madam"));
	}
}
