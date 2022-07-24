/******************************************************************************
Given 2 non-negative integers m and n, find gcd(m, n)
GCD of 2 integers m and n is defined as the greatest integer g 
such that g is a divisor of both m and n.

*******************************************************************************/

import java.io.*; 
import java.util.*; 


class Main {

	public static long gcd(long n, long m){
		if(m == 0){
			return n;
		}
		return gcd(m, n % m);
	}

	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		System.out.println(gcd(n, m));
	}
}