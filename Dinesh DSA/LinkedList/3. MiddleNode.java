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
    
    //find the middle
     Node middleNode(Node head){
        if(head == null){
             return null;
        }
        
        Node fastPtr = head;
        Node slowPtr = head;
        
        while(fastPtr != null && fastPtr.next!=null){
           fastPtr=fastPtr.next.next;
           slowPtr=slowPtr.next;
        }
        return slowPtr;
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
	    Node fifth = new Node(59);
		
		mm.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		
		mm.printList(mm.head);
		
		Node middle = mm.middleNode(mm.head);
	    System.out.println(middle.data);
	}
}
