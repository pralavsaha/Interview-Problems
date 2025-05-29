package OneMonthPreparationKit.Basics.Week2Problems;
import java.util.*;

public class MaxMin {

    public static int maxMin(int k, List<Integer> arr) {


        Collections.sort(arr);
        int minUnFair = Integer.MAX_VALUE;

        for(int i=0;i<=arr.size() - k ;i++ ) {
            int currentUnFair = arr.get(i+k-1) - arr.get(i);
            minUnFair = Math.min(minUnFair,currentUnFair);
        }

        return minUnFair;

    }
}
