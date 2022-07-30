/******************************************************************************
Primitive DataType
------------------
int(4 Bytes),double(8 Bytes),boolean(1 Bit),char(2 Bytes)
*It has fixed size.

Reference DataType
------------------
arrays,Strings,Objects
They store adddress instead of value.
* Reference to the adddress of heap memory

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int[] arr = new int[3];
		System.out.println(arr[0]);
		int[] b = arr;
		b[0] = 5;
		System.out.println(arr[0]); //It wont be 0 since address is passed to b
	}
}
/******************************************************************************
                                Dynamic Array
* Don't have fixed size.
* If you add a fixed space(say 10) throughout the array,time complexity => O(n^2).
* (Good approach) If you multiply arry by 2.
   3 + 6 + 12 + 24 + 48 +... n
   n + n/2 + n/4 + n/8 + ... + 1 => 2^n = x , x = log x(base 2)
   time complexity => O(2n)


In java ArrayList is dynamic array.
  * In arrayList you can store Int,Obj,Boolean,String,Double,... but not primitive
    like int,char,double,boolean,...
 ArrayList<String> arr = new ArrayList<>(); 
  1. arr.add()
  2. arr.add(0,"Apple") //Apple is added at 0th index,other elements shifted automatically.
  3. arr.get(0) //fetch element at index 0
  4. arr.set(2,"Berry") //value at 2nd index is changed to Berry
  5. arr.remove()
      i. removing by index   arr.remove(1) //remove element at index 1
      ii. removing by value   arr.remove("Berry") //remove element at index 1
     arr.clear() //remove all items
  6. arr.size() //returns size

*******************************************************************************/

//ToDo Dynamic Array



/******************************************************************************
                            For printing 2D array
*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int[][] arr = {{1,2},{2,3,4,5},{5,34,78,89}};
		for(int i=0;i<arr.length;i++){
		    //printing inner elements
		    for(int j=0;j<arr[i].length;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		}
	}
}
