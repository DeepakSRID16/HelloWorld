package basic.pack;
public class LinkedList1 {
	
	Node head;
	static class Node {
		int data ;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	 /* This function prints contents of linked list starting from head */
    public void printList()
    {
        Node n = head;
        while (n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }
 public static void main(String arr[]) {
			LinkedList1 llist = new LinkedList1();
		 	llist.head       = new Node(1);
		 	System.out.println(llist.head);
		 	
	        Node second      = new Node(2);
	        System.out.println(second);
	        Node third       = new Node(3);
	 
	        llist.head.next = second; // Link first node with the second node
	        second.next = third; // Link first node with the second node
	        llist.printList();
	  }
}
