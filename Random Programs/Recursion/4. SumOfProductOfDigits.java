/******************************************************************************
                  Sum of Product of Digits of a given number 
You are given two numbers n1 and n2. You need to find the sum of the products 
of their corresponding digits. 
So, for a number n1= 6 and n2 = 34, you'll do (6*4)+(0*3) = 24.

*******************************************************************************/
public static int sumOfProductOfDigits(int n1, int n2)
{
    // Your code here
    if(n1==0 || n2==0){
        return 0;
    }
    return (n1%10) * (n2%10) + sumOfProductOfDigits(n1/10, n2/10);
}