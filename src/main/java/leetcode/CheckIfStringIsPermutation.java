package leetcode;

public class CheckIfStringIsPermutation {
    public static void main(String[] args) {
        String s1="bbcc";
        String s2="cbcb";
        System.out.println(checkForPermutation(s1,s2));
        System.out.println(Double.MIN_VALUE);
    }
    public  static boolean checkForPermutation(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int sum1=0, sum2=0;
        for(int i=0; i< s1.length(); i++) {
            int x = s1.charAt(i);
            int y = s2.charAt(i);
            sum1+=x;
            sum2+=y;

        }
        return sum1 == sum2;
    }
}
