package Blind75.Arrays;

public class MaximumSubarray {

    public static int maxSubarray(int[] arr) {
        int sum = 0;
        int res = 0;
        for(int i: arr) {
            sum = sum + i;
            if(sum < 0)
                sum = 0;
            res = Math.max(res,sum);
        }
        if(res == 0) {
            res = Integer.MIN_VALUE;
            for(int i :arr) {
                res = Math.max(res,i);
            }
        }
        return res;
    }
}
