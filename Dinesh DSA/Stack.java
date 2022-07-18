/******************************************************************************
                                STACK
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
