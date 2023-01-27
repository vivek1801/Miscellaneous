package ds.exercise.linkedlist;
// Think with 3 pointers
public class ReverseLinkedList {
    private Node head;
    public static void main(String[] args) {
        ReverseLinkedList ri=new ReverseLinkedList();
        for(int i=0; i < 5 ; i++) {
            ri.append(i*5);
        }

        ri.reverseTheList();

        ri.printList();
    }

    private void reverseTheList(){
       Node next=null;
       Node prev=null;
       Node current=head;
       while(current !=null){
           next=current.next;
           current.next=prev;
           prev=current;
           current=next;
       }
       head=prev;
    }
    public void printList()
    {
        Node node = head;
        while (node != null) {
            System.out.print("---> "+node.data);
            node = node.next;
        }
    }
    private void append(int data){
        if(head==null){
            head=new Node(data);
            return;
        }
        Node current=head;
        while (current.next !=null){
            current=current.next;
        }
        Node newNode=new Node(data);
        current.next=newNode;
    }
}
