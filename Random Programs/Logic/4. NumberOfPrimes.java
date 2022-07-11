/******************************************************************************

Given a number n find the number of prime numbers less than equal to that number.

*******************************************************************************/


import java.util.*;
public class Main
{
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        long sqrt_n = (long)Math.sqrt(n);
        for (int i=2;i<=sqrt_n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number");
	    int a = sc.nextInt();
	    int count=0;
	    for (int i=1;i<=a;i++){
	        if(isPrime(i)){
	            count++;
	        }
	    } 
		System.out.println(count);
	}
}
