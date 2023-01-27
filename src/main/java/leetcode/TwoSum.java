package leetcode;

import java.util.Arrays;

/**
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] numArray=new int[3];
        numArray[0]=2;
        numArray[1]=7;
        numArray[2]=11;
        numArray[3]=15;
        int[] ar=twoSum(numArray, 9);

        for(int index: ar){
            System.out.printf("index" + index);
        }

    }

   public static int[] twoSum(int[] nums, int target) {
       int first = 0;
       int last=nums.length-1;
       int sum=0;
       while (first<last){
            sum = nums[first] + nums[last];
           if(sum ==target){
               return new int[]{first,last};
           } else if(sum< target){
               first++;
           } else{
               last--;
           }

       }
       return new int[]{0,0};
   }

}
