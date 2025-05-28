package OneMonthPreparationKit.Basics.Week1Problems;
import java.util.*;

public class SubarrayDivision1 {

    public static int birthday(List<Integer> s, int d, int m) {
        int month_temp = 1;
        int count = 0;
        int days_sum = 0;

        for(int i=m-1; i< s.size();i++) {
            int temp = i;

            while(month_temp <= m) {
                days_sum += s.get(temp);
                temp--;
                month_temp++;
            }

            if(days_sum == d) {
                count++;
                days_sum=0;
                month_temp = 1;
            }
        }

        return count;

    }
}
