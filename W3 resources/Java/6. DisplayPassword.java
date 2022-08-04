
import java.util.*;
import java.io.Console;
public class Main
{
	public static void main(String[] args) {
		Console cons;
		if ((cons = System.console()) != null) {
			char[] userPassword = null;
			try {
				userPassword = cons.readPassword("Input your Password:");
				System.out.println("Your password was: " + new String(userPassword));
			} finally {
				if (userPassword != null) {
					java.util.Arrays.fill(userPassword, ' ');
				}
			}
		} else {
			throw new RuntimeException("Can't get password...No console");
		}
	}	
	
}
