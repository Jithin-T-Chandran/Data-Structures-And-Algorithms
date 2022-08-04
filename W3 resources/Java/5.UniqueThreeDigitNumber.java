/******************************************************************************
Create and display unique three-digit number using 1, 2, 3, 4. Also count how 
many three-digit numbers are there
 
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	int count=0;
    	for (int i=1;i<=4;i++){
    	    for (int j=1;j<=4;j++){
    	    	for (int k=1;k<=4;k++){
    	             if(i!=j && j!=k && k!=i){
    	                 count++;
    	                 System.out.println(i+""+j+""+k);
    	             }
    	        } 
    	    } 
    	}
    System.out.println("The total count = "+count);
		
	}
}

//unique 3 digits numbers using array and any numbers
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	int[] arr = {4,5,6,7,8,9};
	int count=0;
    	for (int i=0;i<arr.length;i++){
    	    for (int j=0;j<arr.length;j++){
    	    	for (int k=0;k<arr.length;k++){
    	             if(arr[i]!=arr[j] && arr[j]!=arr[k] && arr[k]!=arr[i]){
    	                 count++;
    	                 System.out.println(arr[i]+""+arr[j]+""+arr[k]);
    	             }
    	        } 
    	    } 
    	}
    System.out.println("The total count = "+count);
		
	}
}

