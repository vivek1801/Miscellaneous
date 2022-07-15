package sort;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for (int i=0; i<n;i++){
            array[i]=sc.nextInt();
        }
        int[] sortedArray=sort(array);
        for(int sa: sortedArray){
            System.out.println(sa);
        }
    }

    private static int[] sort(int[] numArray){
        for(int i=0; i<numArray.length; i++){
            for(int j=i+1; j<numArray.length; j++){
                if(numArray[j]<numArray[i]){
                    int temp=numArray[i];
                    numArray[i]=numArray[j];
                    numArray[j]=temp;
                }
            }
        }
        return numArray;
    }
}
