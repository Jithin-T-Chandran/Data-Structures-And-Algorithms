static int Factorial(int N){
//Enter your code here	
    if(N==0){
        return 1;
    }
    else{
        return(N*Factorial(N-1));
    }
}


//without recursion
 public static int factorial(int n){
       
       int temp =1;
       for (int i=1;i<=n;i++){
           temp*=i;
       }
       return temp;
    }