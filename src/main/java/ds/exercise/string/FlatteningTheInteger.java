package ds.exercise.string;

public class FlatteningTheInteger {
    public static void main(String[] args) {
        int originalNum=12344;
        int copy = originalNum;
        int len = 0;
        while (copy != 0) {
            len++;
            copy = copy / 10;
        }
        int[] intArray=new int[len];
        int count=0;
        while(originalNum !=0){
            intArray[len-count-1]=originalNum%10;
            originalNum=originalNum/10;
            count++;
        }
        for(int integer: intArray){
            System.out.println(integer);
        }
    }
}
