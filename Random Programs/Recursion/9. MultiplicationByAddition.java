static int  Multiply_by_recursion(int M, int N) 
{ 
  //Enter your code here
  if(N == 1){
    return M;
  }
  else{
    int add=0,i=1;
    while(i<=N){
      add+=M;
      i++;
    }
    return add;
  }
}