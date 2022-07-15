import java.util.*;

public class Main
{
	public static void main(String[] args) {
		String str = "Jithin";
		String revstr = "";
		for (int i=0;i<str.length();i++){
		    System.out.print(str.charAt(i)+"");
		    revstr = str.charAt(i)+revstr;
		} 
		System.out.println();
		System.out.println(revstr);
	}
}
