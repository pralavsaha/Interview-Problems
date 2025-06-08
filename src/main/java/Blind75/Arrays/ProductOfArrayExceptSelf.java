package Blind75.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productArray(int[] arr) {
        int prefix = 1;
        int postfix = 1;
        int[] res = new int[arr.length];

        for(int i=0;i<res.length;i++) {
            res[i] = prefix;
            prefix = prefix * arr[i];
        }

        for(int i=arr.length-1;i>0;i--) {
            res[i] = res[i] * postfix;
            postfix = postfix * arr[i];
        }

        return res;
    }
}
