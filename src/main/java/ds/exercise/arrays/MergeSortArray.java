package ds.exercise.arrays;

import java.util.Scanner;

public class MergeSortArray {
    public static void main(String[] args) {
        int[] numArray1=new int[5];
        int[] numArray2= new int[4];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input First Array");
        for(int i=0; i< numArray1.length; i++){
            numArray1[i]=scanner.nextInt();
        }
        System.out.println("Input Second Array");
        for(int j=0; j< numArray2.length; j++){
            numArray2[j]=scanner.nextInt();
        }
        int[] sortedArray=mergeSort(numArray1,numArray2);
    }

    private static int[] mergeSort(int[] numArray1, int[] numArray2) {
        int[] sortedArray=new int[numArray1.length+numArray2.length];
      while (true){
         // numArray1
      }
    }

}
