package ds.exercise.linkedlist;

public class MiddleOfLinkedLIst {
    private Node head;
    public static void main(String[] args) {
        MiddleOfLinkedLIst mi=new MiddleOfLinkedLIst();
        for(int i=0; i < 5 ; i++) {
         mi.append(i*5);
        }
        mi.printMiddleOfLL();
        mi.printList();
        System.out.println("Size of the List is ::"+ mi.getLengthOfLinkedList());
        mi.alternateWayToGetMiddleOfList();
    }

    private int getLengthOfLinkedList(){
        int len=0;
        Node temp=head;
        while(temp !=null){ //THis is tricky. We can't use next, else it will go to next node and size will be one less
            len++;
            temp=temp.next;
        }
        return len;
    }

    private void alternateWayToGetMiddleOfList(){
        int mid=getLengthOfLinkedList()/2;
        Node current=head;
        while(mid !=0){
            current=current.next;
            mid--;
        }
        System.out.println("Mid of List is ::"+ current.data);
    }
    private void printMiddleOfLL(){
        Node fast=head;
        Node slow=head;
        while(fast !=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("Middle of the List:: "+ slow.data);
    }

    private void append(int data){
        if(head==null){
            head=new Node(data);
            return;
        }
        Node currentNode=head;
        while(currentNode.next!= null){
            currentNode=currentNode.next;
        }
        Node newNode=new Node(data);
        currentNode.next=newNode;
    }

    public void printList()
    {
        Node node = head;
        while (node != null) {
            System.out.print("---> "+node.data);
            node = node.next;
        }
    }
}
