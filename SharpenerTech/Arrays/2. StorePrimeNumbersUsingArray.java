import java.util.*;
public class Main
{
    public static int[] printPrime(int n){
        int[] arr = new int[10001];
        int count=0;
        for(int i=2;i<=n;i++){
            boolean flag = true;
            int sqrt_n = (int)Math.sqrt(i);
            for(int j=2;j<=sqrt_n;j++){
                if(i%j==0){
                    flag = false;;
                }
            }
            if(flag){
               arr[count]= i;
               count++;
            }
        }
        return arr;
        
    }
	public static void main(String[] args) {

    
		int[] arr = printPrime(50);
	    int i=0;
	    while(arr[i]!=0){
	        System.out.print(arr[i]+" ");
	        i++;
	    }
	
	}
}



/******************************************************************************
Write a program to store first n prime numbers in an array . After storing 
return the array.
*******************************************************************************/

import java.util.*;
public class Main
{
    public static int[] printPrime(int n){
        int[] arr = new int[n];
        int count=0;
        int i=2;
       while(count<=n-1){
       
            boolean flag = true;
            int sqrt_n = (int)Math.sqrt(i);
            for(int j=2;j<=sqrt_n;j++){
                if(i%j==0){
                    flag = false;;
                }
            }
            if(flag){
             arr[count] = i;
             count++;
             
            }
            i++;
        }
        
        return arr;
        
    }
	public static void main(String[] args) {

    
		int[] arr = printPrime(20);
	   
	   System.out.println(Arrays.toString(arr));
	
	}
}
