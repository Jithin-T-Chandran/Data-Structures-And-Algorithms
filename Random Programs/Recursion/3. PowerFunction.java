import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.text.DecimalFormat;
// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc=new Scanner(System.in);
		DecimalFormat numberFormat=new DecimalFormat("#0.00");
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
			double X=sc.nextDouble();
		    double N=sc.nextDouble();
			double k=pow(X,N);
			System.out.println(numberFormat.format(k));
			
		}
	}
	public static double pow(double X,double N){
		if(N==0)
		{
			return 1;
		}
		else if(N<0){
			return(1/X*pow(X,N+1));
		}
		else{
			return(X*pow(X,N-1));
		}
	}
}