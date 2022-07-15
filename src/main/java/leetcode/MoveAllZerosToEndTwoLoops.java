package leetcode;

public class MoveAllZerosToEndTwoLoops {
    public static void main(String[] args) {
        int[] numArray = {0, 1, 0, 3, 12};
        moveZerosToEnd(numArray);
        for (int num : numArray) {
            System.out.println(num);
        }
    }

    private static void moveZerosToEnd(int[] numArray) {
        int count = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] != 0) {
                numArray[count++] = numArray[i];
            }
        }
        for(int j=count; j<numArray.length; j++){
            numArray[j]=0;
        }
    }
}
