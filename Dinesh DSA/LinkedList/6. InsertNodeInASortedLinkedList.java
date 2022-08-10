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
    
    
    
    //Insert Node in sorted linkedList
    Node insertNode(int data){
        
        Node newNode = new Node(data);
        
        if(head==null){
            return newNode;
        }
        
        Node current = head;
        Node temp = null;
        
        while(current!=null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        
       newNode.next = current;
       temp.next = newNode;
       return head;
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
		Node second = new Node(3);
		Node third = new Node(5);
		Node fourth = new Node(6);
	    Node fifth = new Node(9);
		
		mm.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		
		mm.printList(mm.head);
		mm.insertNode(8);
        mm.printList(mm.head);
	}
}
