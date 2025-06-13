package Blind75.Arrays;
import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] arr) {

        Set<List<Integer>> res  = new HashSet<>();
        if(arr.length == 0) return new ArrayList<>(res);

        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++) {
            int j= i+1;
            int k = arr.length-1;

            while(j<k) {
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == 0)
                    res.add(Arrays.asList(arr[i],arr[j++],arr[k--]));
                else if(sum <0)
                    j++;
                else if(sum > 0)
                    k--;
            }
        }
        return new ArrayList<>(res);
    }
}
