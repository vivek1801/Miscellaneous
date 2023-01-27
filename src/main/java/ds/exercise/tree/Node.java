package ds.exercise.tree;

public class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
        this.left=null;
        this.right=null;
    }
    public void insert(int value){
        if(value<= data){
            if(left==null){
                left=new Node(value);
            } else{
                left.insert(value);
            }
        } else{
            if(right==null){
                right=new Node(value);
            } else{
                right.insert(value);
            }
        }
      }

}
