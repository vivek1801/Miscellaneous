package leetcode;

import java.util.*;

public class SingleNumber {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{4, 1, 2, 1, 2};
        //Approach one
        Set<Integer> set=new HashSet<>();
        for(Integer integer: array) {
            if (set.contains(integer)){
                set.remove(integer);
            } else {
                set.add(integer);
            }
        }
        System.out.println(set.stream().findFirst().get());
        //Approach 2
        int c=array[0];
        for (int i=1; i< array.length; i++){
            c=c^array[i];
        }
        System.out.println("Number is "+c);
    }

}
