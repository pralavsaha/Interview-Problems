package Blind75.Arrays;

public class ContainsMostWater {

    public static int mostWater(int[] arr) {
        int maxArea = 0;
        int start = 0;
        int end  = arr.length-1;
        while(start < end) {
            if(arr[start] < arr[end])
                maxArea = Math.max(maxArea,arr[start]*(end-start));
            else
                maxArea = Math.max(maxArea, arr[end]*(end-start));
        }

        return maxArea;
    }
}
