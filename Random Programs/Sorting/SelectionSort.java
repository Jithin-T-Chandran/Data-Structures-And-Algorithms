import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class Main {

	public static void selectionSort(int arr[], int n){
		for(int i = n - 1; i > 0; i--){
			int max_index = i;
			for(int j = 0; j < i; j++){
				if(arr[j] > arr[max_index]){
					max_index = j;
				}
			}
			if(max_index != i){
				int temp = arr[i];
				arr[i] = arr[max_index];
				arr[max_index] = temp;
			}
		}
	}


	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0){
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i < n; i++){
				arr[i] = sc.nextInt();
			}
			selectionSort(arr, n);
			for(int i = 0; i < n; i++){
				System.out.print(arr[i]+ " ");
			}
			System.out.println();
		}
		
	}
}