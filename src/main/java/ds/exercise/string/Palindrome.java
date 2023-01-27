package ds.exercise.string;

public class Palindrome {
    public static void main(String[] args) {
        int originalNum=2111221112;
        int x=originalNum;
        int reverse=0;
        while(x!=0){
            int rem=x%10;
            reverse=reverse*10 + rem;
            if(originalNum>=Integer.MAX_VALUE || originalNum<=Integer.MIN_VALUE){
               break;
            }
            x=x/10;
        }
        if(reverse==originalNum){
            System.out.println("Its Palindrome");
        }else {
            System.out.println("Its not palindrome");
        }
    }
}
