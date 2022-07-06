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