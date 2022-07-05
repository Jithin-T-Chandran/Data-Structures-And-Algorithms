/******************************************************************************

Given a number N, find the sum of all the digits of the number

*******************************************************************************/
static long  Sum(long  n) 
    { 
      if(n==0){
        return 0;
      }
      return n%10 + Sum(n/10);
    }