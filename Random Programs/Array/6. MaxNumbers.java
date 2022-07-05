/******************************************************************************
*Max numbers
Given an array A of size N, you need to find its maximum,
2nd maximum and 3rd maximum element.

*******************************************************************************/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
			int N = sc.nextInt();
			int [] a = new int[N];
			for(int j=0;j<N;j++){
				a[j] = sc.nextInt();
			}
			int f=0, s=0, t=0;
			for(int j=0;j<N;j++){
                if(a[j] > f){
					t = s;
					s = f;
					f = a[j];
				}
				else if(a[j] > s){
					t = s;
					s = a[j];
				}
				else if(a[j] > t){
					t = a[j];
				}
			}
			System.out.println(f + " " + s + " " + t);
		}
	}
}