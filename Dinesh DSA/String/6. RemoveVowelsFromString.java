/******************************************************************************
Remove Vowels from a string

*******************************************************************************/
import java.util.*;
public class Main
{
    public static String removeVowels(String str){
        Set<Character> vowels = Set.of('a','e','i','o','u');
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();
        for(Character ch : arr){
            if(!vowels.contains(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		System.out.println(removeVowels("ice cream"));
	}
}
