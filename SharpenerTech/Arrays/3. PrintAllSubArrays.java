import java.util.*;
public class Main
{
   
    public static void print_subarray(int arr[],int n)
    {
        for (int i=0; i <n; i++)
        {
           
            for (int j=i; j<n; j++)
            {
              
                for (int k=i; k<=j; k++)
                    { 
                        System.out.print(arr[k]+"");
                    }
                System.out.println("");
            }
            
        }
    }
     public static void main(String[]args)
        {
            /*
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }*/
            int[] arr = {1,2,3,4,5};
            print_subarray(arr,arr.length);
            
        }
}