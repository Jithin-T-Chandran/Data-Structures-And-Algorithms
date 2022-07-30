public class Main
{   
    public static int sumOfDigits(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
	public static void main(String[] args) {
		System.out.println(sumOfDigits(1234623));
	}
}


//Recursion



public class Main
{   
    public static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }

        return n%10 + sumOfDigits(n/10);
    }
	public static void main(String[] args) {
		System.out.println(sumOfDigits(1234623));
	}
}
