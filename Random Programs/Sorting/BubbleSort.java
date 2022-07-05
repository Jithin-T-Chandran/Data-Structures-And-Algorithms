import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {

    public static void bubbleSort(int arr[], int N){
		for(int i=0;i<N-1;i++){
			for(int j=0;j<N-i-1;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
    public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0){
			int N = sc.nextInt();
			int arr[] = new int[N];
			for(int i=0;i<N;i++){
				arr[i] = sc.nextInt();
			}
			bubbleSort(arr, N);
			for(int i=0;i<N;i++){
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}
}