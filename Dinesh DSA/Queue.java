import java.lang.*;
public class Main
{
    public Node front;
    public Node rear;
    int length;
    
    Main(){
        front = null;
        rear = null;
        length = 0;
    }
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    
    public void Enqueue(int data){
        Node temp = new Node(data);
        if(isEmpty()){
            front = temp;
        }else{
            rear.next = temp;
        }
        rear=temp;
        length++;
    }
    public int Dequeue(){
        if(isEmpty()){
           return -1;
        }
        int result = front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }
        length--;
        return result;
    }
    public void printQueue(){
        if(isEmpty()){
            return;
        }
        Node current = front;
        while(current!=null){
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.println("null");
    }
	public static void main(String[] args) {
	  Main mm = new Main();
	  mm.Enqueue(16);
	  mm.Enqueue(45);
	  mm.Enqueue(23);
	  mm.Enqueue(51);
	  mm.Enqueue(98);
	  mm.printQueue();
	  mm.Dequeue();
	  mm.printQueue();
	  mm.Dequeue();
	  mm.printQueue();
	  
	}
}
