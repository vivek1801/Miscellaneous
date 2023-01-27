package random;

import java.time.LocalDate;
import java.time.ZoneId;


public class Solution {
    public static void main(String[] args) {
        LocalDate dateNew = LocalDate.now().plusDays(1);
        long l= dateNew.atStartOfDay(ZoneId.systemDefault()).toEpochSecond() * 1000;
        System.out.println(l);
    }
}

