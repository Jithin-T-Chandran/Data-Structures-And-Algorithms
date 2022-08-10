

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
    
    //insertion at any position
    void insertion(int data,int position){
        Node temp = new Node(data);
        if(position == 1){
            temp.next = head;
            head = temp;
        }else{
            Node previous = head;
            int count = 1;
            while(count < position-1){
                previous = previous.next;
                count++;
            }
            Node current = previous.next;
            temp.next = current;
            previous.next = temp;
        }
    }
    
    //Delete any node at position
    void deletion(int position){
        if(position == 1){
            head=head.next;
        }else{
            Node previous = head;
            int count = 1;
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            Node current = previous.next;
            previous.next = current.next;
        }
    }
    
    //search
    boolean search(int key){
        Node current = head;
        while(current!=null){
            if(current.data == key){
                return true;
            }
            current=current.next;
        }
        return false;
    }
    
    void printList(Node head){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
    
    int length(){
        int count=0;
        Node current = head;
        while(current!=null){
              count++;
            current=current.next;
        }
        return count;
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
		System.out.println(mm.length());
		mm.insertion(78,3);
	    mm.printList(mm.head);
	    mm.deletion(4);
	    mm.printList(mm.head);
	    System.out.println(mm.search(88));
	}
}
