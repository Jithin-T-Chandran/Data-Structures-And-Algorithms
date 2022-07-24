/******************************************************************************
Design a stack that supports push, pop, top, and retrieving the minimum element
in constant time.

Implement the MinStack class:

1.MinStack() initializes the stack object.
2.void push(int val) pushes the element val onto the stack.
3.void pop() removes the element on the top of the stack.
4.int top() gets the top element of the stack.
5.int getMin() retrieves the minimum element in the stack.
6.You must implement a solution with O(1) time complexity for each function.

*******************************************************************************/
class MinStack{
    int[] stack;
    int[] min;
    int topPtr;
    int minPtr;
    
    MinStack(){
        stack = new int[10000];
        min = new int[10000];
        topPtr =-1;
        minPtr =-1;
    }
    
    void push(int x){
        if(topPtr>=10000){
            return;
        }
        stack[++topPtr] = x;
        if(minPtr>=0){
            if(min[minPtr]>x){
                min[++minPtr] = x;
            }else{
                min[minPtr + 1] =min[minPtr];
                minPtr++;
            }
            
        }else{
            min[++minPtr] = x;
        }
        
    }
    void pop(){
        if(topPtr<0){
            return;
        }
        topPtr--;
        minPtr--;
    }
    int top(){
        return stack[topPtr];
    }
    int getMin(){
        return min[minPtr];
    }
    
}
public class Main
{
	public static void main(String[] args) {
		MinStack minstack = new MinStack();
		minstack.push(12);
		minstack.push(79);
		minstack.push(15);
		minstack.push(3);
		minstack.push(349);
		minstack.push(12);
		
		System.out.println(minstack.top());
		System.out.println(minstack.getMin());
	}
}
