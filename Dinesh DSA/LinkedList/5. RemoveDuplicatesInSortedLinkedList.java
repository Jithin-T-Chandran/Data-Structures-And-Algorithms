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
    
    
    
    //Remove Duplicates
    void removeDuplicates(){
        Node current = head;
        while(current !=null && current.next !=null){
            if(current.data == current.next.data){
                
                current.next = current.next.next;
                
            }else{
                current=current.next;
            }
        }
       
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
		Node second = new Node(1);
		Node third = new Node(2);
		Node fourth = new Node(3);
	    Node fifth = new Node(3);
		
		mm.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		
		mm.printList(mm.head);
		mm.removeDuplicates();
        mm.printList(mm.head);
	}
}
