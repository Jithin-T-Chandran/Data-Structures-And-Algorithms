/******************************************************************************
           Bubble Sort 
Consider a bucket of bubbles,Large bubbles automatically shift to last positions.
"Every iteration largest element will set as the last"

*******************************************************************************/
    public static void bubbleSort(int[] arr,int n){
        int swap=0;
        for (int i=0;i<n-1;i++){
            swap = 0;
            for(int j=0;j<n-1-i;j++){
                int temp = arr[j];
                arr[j] =  arr[j+1];
                arr[j+1] = temp;
                swap++;
            }
            if(swap==0){
                break;
            }
        } 
    }