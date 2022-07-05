/******************************************************************************
*Season Of Love
In this season of love, everyone wants to surprise each other.
You are also super excited and you wish to buy roses of 3 different colors. You always buy roses in order, white, yellow, red.
So if you buy 7 roses, they will be "white, yellow, red, white, yellow, red, white".
You need to find the number of yellow roses that you will buy?

*******************************************************************************/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int numofyellow = N/3;
	if(N%3 ==2){
		numofyellow++;
	}
	System.out.print(numofyellow);
	}
}