package ds.exercise.linkedlist;

public class LinkedListAddElementAtIndex {
    private Node head;

    public static void main(String[] args) {
        LinkedListAddElementAtIndex linkedList=new LinkedListAddElementAtIndex();
        for(int i=0; i <5; i++){
            linkedList.append(5*i);
        }
        linkedList.addAtIndex(1,25);
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
    private void addAtIndex(int index, int data){
        Node current=head;
        Node previous=null;
        for(int i=0; i<index;i++){
            previous=current;
            current=current.next;
            if(current==null){
                break;
            }
        }
        Node newNode=new Node(data);
        newNode.next=current;
        previous.next=newNode;
    }
}
