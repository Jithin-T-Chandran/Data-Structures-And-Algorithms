public class Main
{
    //Node class
   Node head;
   static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    //reverse LinkedList
     Node reverse(Node head){
        if(head == null){
             return head;
        }
        Node previous = null;
        Node current = head;
        Node next = null;
        
        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    

    
    void printList(Node head){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
    
	public static void main(String[] args) {
		Main mm = new Main();
		mm.head = new Node(1);
		Node second = new Node(23);
		Node third = new Node(34);
		Node fourth = new Node(88);
		
		mm.head.next = second;
		second.next = third;
		third.next = fourth;
		
		
		mm.printList(mm.head);
		
		//calling reverse method
		Node newHead = mm.reverse(mm.head);
		
		mm.printList(newHead);

	}
}
