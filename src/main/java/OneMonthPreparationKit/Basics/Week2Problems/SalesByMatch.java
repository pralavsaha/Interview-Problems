package OneMonthPreparationKit.Basics.Week2Problems;
import java.util.*;


public class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {

        Set<Integer> col_set = new HashSet<>();
        int count = 0;
        for(int i=0;i<n;i++) {
            if(col_set.contains(ar.get(i))) {
                count++;
                col_set.remove(ar.get(i));
            }
            else
                col_set.add(ar.get(i));
        }

        return count;

    }
}
