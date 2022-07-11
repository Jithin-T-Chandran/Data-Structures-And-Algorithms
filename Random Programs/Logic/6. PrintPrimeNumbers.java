

public class Main
{
    public static void printPrime(int n){

        for (int i=2;i<=n;i++){
            long sqrt_n = (long)Math.sqrt(i);
                boolean flag = true;
                 for (int j=2;j<=sqrt_n;j++){
                         if(i%j==0){
                             flag = false;
                            } 
                    }
                if(flag){
                    System.out.print(i+" ");
                }
            
            }


    }
    
	public static void main(String[] args) {
		printPrime(50);
	}
}
