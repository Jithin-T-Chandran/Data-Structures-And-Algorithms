/******************************************************************************
Tower of Hanoi

*******************************************************************************/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		towerOfHanoi(n,'A','C','B');
	}
	public static void towerOfHanoi(int n,char frmRod,char toRod,char usingRod) {
		if (n == 1) {
			System.out.println("Move disk 1 from "+frmRod+" to "+toRod);
			return;
		}
		towerOfHanoi(n -1, frmRod, usingRod, toRod);
		System.out.println("Move disk "+n+":"+"from "+frmRod+" to "+toRod);
		towerOfHanoi(n -1, usingRod, toRod, frmRod);
	} 
}