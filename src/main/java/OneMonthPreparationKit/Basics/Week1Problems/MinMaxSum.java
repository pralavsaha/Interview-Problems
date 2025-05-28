package OneMonthPreparationKit.Basics.Week1Problems;
import java.util.*;

public class MinMaxSum {

    public static void minMaxSum(int[] arr) {
        long total_sum = 0 ;

        for(int i : arr)
            total_sum += i;
        Arrays.sort(arr);

        System.out.print(total_sum-arr[arr.length-1] +" "+ (total_sum-arr[0]));
    }
}
