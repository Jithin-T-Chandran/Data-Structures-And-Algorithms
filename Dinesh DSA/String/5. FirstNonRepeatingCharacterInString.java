/******************************************************************************
Given a String s, return index of first non repeating character in it.If it 
doesn't exist return -1;

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int firstNonRepeatingCharacter(String s){
        Map<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for(char c : arr){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        for(int i=0;i<arr.length;i++){
            char c = arr[i];
            if(map.get(c) == 1){
                System.out.print("Letter "+arr[i]+" At index: ");
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		System.out.println(firstNonRepeatingCharacter("codeforcode"));
	}
}
