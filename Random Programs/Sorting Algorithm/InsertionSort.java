
import java.util.*;

public class Main
{

    public static int[] insertionSort(int[] arr,int n){
        for(int i = 1;i<n;i++){
            int temp = arr[i];
            int j=i-1;
              while(j>=0 && arr[j]>temp){
                    arr[j+1] =arr[j];
                    j--;
               }
               arr[j+1]=temp;
        }
        

        return arr;
    }
	public static void main(String[] args) {
		int[] arr = {56,4,90,36,68,23,45,38,67,534,566,7,8,6,45,6,47};
		int n = arr.length;
		System.out.println(Arrays.toString(insertionSort(arr,n)));
	}
}
