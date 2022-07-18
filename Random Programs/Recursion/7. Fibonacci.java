/******************************************************************************
Given an integer N, find the Nth number in the fibonacci series. 
Consider 0 and 1 to be the seed values.

In the fibonacci series, each number (Fibonacci number) is the sum of the 
two preceding numbers. The series with 0 and 1 as seed values will go like -
0, 1, 1, 2, 3, 5 and so on..
*******************************************************************************/
static long  Fibonacci(long  n) 
    { 
      if(n==0){
        return 0;
      }
      if(n==1){
        return 1;
      }
      return Fibonacci(n-1) + Fibonacci(n-2);
    }



/******************************************************************************
Fibonacci number using: Bottom-up approach
(DS: Array)
*******************************************************************************/

public class Main
{
    public static int fib(int n){
        int[] table = new int[n+1];
        table[0] = 0;
        table[1] = 1;
        for(int i=2;i<=n;i++){
           table[i] = table[i-1] + table[i-2]; 
        }
        return table[n];
    }
	public static void main(String[] args) {
		System.out.println(fib(5));
	}
}



/******************************************************************************
Fibonacci number using: Top-Down approach
(DS: Array)
*******************************************************************************/

public class Main
{
    public static int fib(int[] memo,int n){
     if(memo[n] == 0){
         if(n<2){
             memo[n] = n;
         }else{
             memo[n] = fib(memo,n-1) + fib(memo,n-2);
         }
     }
     return memo[n];
    }
	public static void main(String[] args) {
	    int[] memo = new int[5+1];
		System.out.println(fib(memo,5));
	}
}

