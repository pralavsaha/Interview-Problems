package Blind75.Arrays;

public class TrappingRainwater {

    public static int trappingWater(int[] arr) {
        int maxArea = 0;
        int[] left = new int[arr.length];
        int[] right =  new int[arr.length];

        left[0] = arr[0];
        for(int i=1;i<arr.length;i++) {
            left[i] = Math.max(left[i-1],arr[i]);
        }

        right[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--) {
            right[i] = Math.max(right[i+1],arr[i]);
        }

        for(int i=0;i<arr.length;i++) {
            maxArea += Math.min(left[i],right[i]) - arr[i];
        }

        return maxArea;
    }
}
