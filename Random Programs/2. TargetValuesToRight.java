import java.util.*;

public class Main
{
    public static void arrangeArray(int[] arr,int k){
        for(int i= arr.length-1;i>=0;i--){
            if(i==k){
               break; 
            }
            for(int j=i-1;j>=0;j--){
                if(arr[j]==k){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
	public static void main(String[] args) {
		int[] arr = {6,1,6,8,10,4,15,6,3,9,6};
	    arrangeArray(arr,6);
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
		
	}
}
