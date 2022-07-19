/******************************************************************************

Program to find minimum and maximum element present in an array

*******************************************************************************/

public class Main
{
    static int minElement(int[] arr){
        int min = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    static int maxElement(int[] arr){
        int max = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
	public static void main(String[] args) {
	    int[] arr ={8,4,67,23,-4,7,34};
		System.out.println(minElement(arr));
		System.out.println(maxElement(arr));
	}
}
