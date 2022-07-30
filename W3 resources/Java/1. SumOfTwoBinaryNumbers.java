

public class Main
{

    static void binarySum(long binary1,long binary2){
        int i=0;
    	int remainter=0;
    	int[] sum = new int[20];
    	
    	while(binary1!=0 && binary2!=0){
    	    sum[i++] = (int)(binary1%10 + binary2%10 + remainter)%2;
    	    remainter= (int)(binary1%10 + binary2%10 + remainter)/2;
    	    binary1=binary1/10;
    	    binary2=binary2/10;
    	}
    	
    	if(remainter!=0){
	         sum[i++] = remainter;
          }
          
	    --i;
	    System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
           System.out.print(sum[i--]);
        }
    }
	public static void main(String[] args) {
	long binary1 = 100010;
	long binary2 = 110010;
	
	binarySum(binary1,binary2);
	}
}
