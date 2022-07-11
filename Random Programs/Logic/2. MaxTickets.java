/******************************************************************************
                            Max tickets
Given N points. You can get 1000 tickets for 500 points or 5 tickets for 
5 points. What is the maximum number of tickets you can earn.

*******************************************************************************/
import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	System.out.println("Enter total points:");
	Scanner sc = new Scanner(System.in);
	long N = sc.nextLong();
	long x = N/500;
	long y = N%500;
	long z = y/5;
	System.out.println("Total Tickest:"+((1000*x)+(z*5)));
	}
}

/******************************************************************************
Sample Input
506

Sample Output
1005

Explanation: we use 500 points to get 1000 tickets and 5 out of remaining 6 points to get 5 tickets making total of 1005 tickets.

Sample Input:-
4

Sample Output:-
0
*******************************************************************************/