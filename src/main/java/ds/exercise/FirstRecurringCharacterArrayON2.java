package ds.exercise;

import java.util.Scanner;

public class FirstRecurringCharacterArrayON2 {
    public static void main(String[] args) {
        int[] numArray=new int[5];
        for(int i=0; i< 5; i++){
            Scanner scanner=new Scanner(System.in);
            numArray[i]=scanner.nextInt();
        }
       int firstRecurring=findFirstRecurring(numArray);
        System.out.println(firstRecurring);
    }

    private static int findFirstRecurring(int [] numArray) {
        int num = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (numArray[i] == numArray[j]) {
                    num = numArray[i];
                    break;
                }
            }
        }
        return num;
    }
}
