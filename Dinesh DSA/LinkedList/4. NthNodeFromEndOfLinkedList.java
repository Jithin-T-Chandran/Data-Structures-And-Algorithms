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
    
    
    
    //find the Nth node from edn
     Node getNthNodeFromEnd(int n){
        if(head == null){
             return null;
        }
        
       Node mainPtr = head;
       Node refPtr = head;
       int count = 0;
       while(count<n){
           refPtr=refPtr.next;
           count++;
       }
       while(refPtr!=null){
           refPtr=refPtr.next;
           mainPtr=mainPtr.next;
       }
       return mainPtr;
       
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
		
		Node nth = mm.getNthNodeFromEnd(4);
	    System.out.println(nth.data);
	}
}
