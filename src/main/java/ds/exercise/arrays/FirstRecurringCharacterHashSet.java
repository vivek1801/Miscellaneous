package ds.exercise.arrays;

import java.util.*;

public class FirstRecurringCharacterHashSet {
    public static void main(String[] args) {
        int[] numArray=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<5; i++){
          numArray[i]=sc.nextInt();
        }
        int num=checkFirstOccurrence(numArray);
        if(num==0) {
            System.out.println("No Occurance");
        } else{
            System.out.println(num);
        }
    }

    private static int checkFirstOccurrence(int[] numArray) {
        int num=0;
         Set<Integer> set=new HashSet<>();
        for(int i=0; i< numArray.length; i++){
            if(!set.contains(numArray[i])) {
                set.add(numArray[i]);
            } else{
                num= numArray[i];
            }
        }
        return num;
    }
}
