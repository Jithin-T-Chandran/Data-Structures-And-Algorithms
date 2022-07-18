/******************************************************************************
                            BINARY SEARCH
                         (Iterative approach)
*******************************************************************************/

public class Main
{
    public int binarySearch(int[] arr,int k){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2; 
            if(arr[mid] == k){
                return mid;
            }
            if(k > arr[mid] ){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	   	int[] arr = {10, 20, 30, 50, 60, 80, 110, 130, 140, 170};
	   	int k = 110;
	   	Main mm = new Main();
	   	System.out.println(mm.binarySearch(arr,k));
	}
}
