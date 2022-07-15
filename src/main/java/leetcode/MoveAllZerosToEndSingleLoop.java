package leetcode;

public class MoveAllZerosToEndSingleLoop {
    public static void main(String[] args) {
        int[] numArray = {0, 1, 0, 3, 12};
        moveZerosToEnd(numArray);
        for (int num : numArray) {
            System.out.println(num);
        }
    }

    private static void moveZerosToEnd(int[] numArray) {
        int c=0;
        for(int i=0; i< numArray.length; i++){
            if(numArray[i] !=0){
                numArray[c++]=numArray[i];
                numArray[i]=0;
            }
        }
    }
}
