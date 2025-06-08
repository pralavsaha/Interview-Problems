package Blind75.Arrays;

public class MaximumProductSubarray {

    public static int maxProductSubarray(int[] arr) {
        int prefix = 1,suffix = 1;
        int maximumProduct = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(prefix == 0)
                prefix = 1;
            if(suffix == 0)
                suffix = 1;

            prefix = prefix * arr[i];
            suffix = suffix * arr[arr.length - i - 1];

            maximumProduct = Math.max(maximumProduct,Math.max(prefix,suffix));
        }
        return maximumProduct;
    }
}
