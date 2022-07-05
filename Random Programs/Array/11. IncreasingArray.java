/******************************************************************************
Increasing array

Abhijit has an Array Arr which may or may not be in strictly increasing order.
He wants to make this array increasing but does not wish to change the position 
of any element so he came with an idea that he will replace an element with any 
of its divisors i.e he changes an element X to M if X%M=0.

Sample Input:-
5
1 2 16 16 16
Sample Output:-
YES
*******************************************************************************/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int[N];
		for(int i=0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		int divisor = 2;
		for(int i=1;i<N;i++){
			while(divisor <= arr[i] && arr[i]%divisor!=0){
				divisor++;
			}

			if(divisor> arr[i])
			{
				System.out.println("NO");
				return;
			}
			divisor++;
		}
		System.out.println("YES");
	}
}