package ds.exercise.linkedlist;

public class LinkedListOperations {
    public Node head;
    public static void main(String[] args) {
        LinkedListOperations linkedList=new LinkedListOperations();
        for(int i=0; i <= 50; i=i+10){
           linkedList.append(i);
        }

        linkedList.prepend(-10);
        linkedList.delete(-10);
        linkedList.printList();
    }
    public void printList()
    {
        Node node = head;
        while (node != null) {
            System.out.print("---> "+node.data);
            node = node.next;
        }
    }

    public void append(int data){
        if(head==null){
            head=new Node(data);
            return;
        }
        Node current=head;
        while (current.next !=null){
            current=current.next;
        }
        current.next=new Node(data);
    }

    public void prepend(int data){
        if(head==null){
            head=new Node(data);
            return;
        }
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void delete(int data){
        if(head==null){
            System.out.println("Nothing to delete");
        }
        if(head.data==data){
            head=head.next;
            return;
        }
        Node current=head;
        while(current.next !=null){
            if(current.next.data==data){
                current.next=current.next.next;
                return;
            }
           current=current.next;
        }
    }
}
