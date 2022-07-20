/******************************************************************************

Mederge two sorted arrays.

*******************************************************************************/
import java.util.*;
public class Main
{   
    public static int[] mergeTwoSortedArray(int[] arr1,int[] arr2,int n,int m){
        int[] temp = new int[n+m];
        int i =0;
        int j =0;
        int k =0;
        while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                temp[k]=arr1[i];
                i++;
            }else{
                 temp[k]=arr2[j];
                 j++;
            }
            k++;
        }
        while(i<n){
            temp[k]=arr1[i];
            i++;
            k++;
        }
        while(j<m){
            temp[k]=arr1[j];
            j++;
            k++;
        }
        return temp;
    }
	public static void main(String[] args) {
	    int[] a1 = {2,9,34,78,83,99,120};
	    int[] a2 = {1,12,23,26,33,56,64,75,78,86,88,92,94};
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(mergeTwoSortedArray(a1,a2,a1.length,a2.length)));
	}
}
