/******************************************************************************
Sum and Mean

Given an array A[] of size N, containing positive integers.
You need to print the sum and mean (floor value) of given numbers.
*******************************************************************************/
static void SumAndMean(int arr[],int N){
  int sum=0;
  int mean=0;
  for(int i=0;i<N;i++){
    sum=sum+arr[i];
    mean= (int)Math.floor(sum/N);
  }
  System.out.print(sum+ " " +mean);
    }