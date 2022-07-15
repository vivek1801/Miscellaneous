package leetcode;

/**
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 */

import java.util.Scanner;
public class MaxSubArray {
    public static void main(String[] args) {
        int[] numArray=new int[10];
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<10; i++){
            numArray[i]=sc.nextInt();
        }
        int maxSum=maxSubArraySum(numArray);
        System.out.println(maxSum);

    }

    private static int maxSubArraySum(int[] numArray) {
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0; i< numArray.length; i++){
            currentSum=currentSum+numArray[i];
            if(currentSum> maxSum){
                maxSum=currentSum;
            }
            if(currentSum < 0){
                currentSum=0;
            }
        }
        return maxSum;
    }
}
