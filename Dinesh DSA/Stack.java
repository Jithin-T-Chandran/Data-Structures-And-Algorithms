/******************************************************************************
                                STACK
Java Stack class has,
add()
push()
pop()
peek()
contains()
get() //type index
set(a,b)  // where a index and b value
size()
*******************************************************************************/

public class Main
{
    Node top;
    int length;
    
    Main(){
        top = null;
        length = 0;
    }
    
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public void push(int data){
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
        length++;
    }
    
    public int pop(){
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return top.data;
    }
    
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void printStack(){
        Node current = top;
        while(current!=null){
            System.out.print(current.data +" ");
            current=current.next;
        }
        System.out.println();
    }
    
	public static void main(String[] args) {
		Main mm = new Main();
		mm.push(66);
		mm.push(56);
		mm.push(78);
		mm.push(36);
		mm.push(789);
		System.out.println(mm.pop());
		mm.printStack();
		System.out.println(mm.peek());
	}
}





/******************************************************************************

Stack using Array

*******************************************************************************/

public class Main
{
    int capacity =10;
    int[] stack = new int[capacity];
    int top = 0;
    
    void push(int data){
        if(top>=capacity){
            System.out.println("StackOverflowError");
        }else{
           stack[top] = data;
           top++;   
        }

    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
            top--;
            int value = stack[top];
            stack[top] = 0;
            return value;
        }
        
        
    }
    
    int peek(){
        return stack[top-1];
    }
    
    void show(){
        for(int i:stack){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    int size(){
        return top;
    }
    boolean isEmpty(){
        return top <=0;
    }
    
	public static void main(String[] args) {
		Main mm = new Main();
		mm.push(12);
		mm.push(72);
		mm.push(1);
		mm.push(89);
		mm.push(92);
		
     
		mm.show();
	//	System.out.println(mm.pop());
	//	mm.show();
		
	//	System.out.println(mm.peek());
	//System.out.println(mm.size());
	//	System.out.println(mm.isEmpty());
	
	}
}
