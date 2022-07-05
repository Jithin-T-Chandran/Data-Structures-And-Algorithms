/******************************************************************************
Replace element

Given an array of N elements, your task is to update every element 
with multiplication of previous and next elements with following exceptions:-
a) First element is replaced by multiplication of first and second.
b) Last element is replaced by multiplication of last and second last.
*******************************************************************************/
class Main {
	public static void main (String[] args) {
	    int[] arr = {2,3,4,5,6};
	    int n = arr.length;
	    int prev = arr[0];
	    arr[0]=arr[0]*arr[1];
	    for(int i=1;i<n-1;i++){
	        int curr = arr[i];
	        arr[i]=prev*arr[i+1];
	        prev = curr;
	    }
	    arr[n-1]=arr[n-1]*prev;
	
	     for(int i=0;i<n;i++){
	       System.out.print(arr[i]+" ");
	    }
	}
}