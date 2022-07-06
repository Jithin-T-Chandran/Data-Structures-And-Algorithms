/******************************************************************************

Selection Sort
eg in mixture when you sort, 
you will put the largest one at the last place,
second largest one to second largest place.
"For us seeing the largest is very easy."

*******************************************************************************/
public static void selectionSort(int[] arr,int n){
        for(int i = n-1;i>=0;i--){
            int max_index = i;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[max_index]){
                    max_index = j;
                }
            }
            if(max_index != i){
                int temp = arr[i];
                arr[i] = arr[max_index];
                arr[max_index] = temp;
            }
        }
    }