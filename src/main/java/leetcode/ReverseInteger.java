package leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger reverseInteger=new ReverseInteger();
        System.out.println(reverseInteger.reverse(123));
    }
        public int reverse(int x) {
            int rev = 0;
            while (x != 0) {
                int reverse = x % 10;
                rev = rev * 10 + reverse;
                if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && reverse > 7)) return 0;
                if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && reverse < -8)) return 0;
                x = x/10;
            }
            return rev;
        }
}
