package Blind75.Arrays;

public class BestTimeOfBuyingAndSellStock {

    public static int maxprofit(int[] arr) {
        int maxPro = 0 ;
        int start = 0;
        int end = 1;
        while(start < end && end < arr.length){
            if(arr[start] <= arr[end]) {
                maxPro = Math.max(maxPro,arr[end] - arr[start]);
                end++;
            }
            else if(arr[start] > arr[end]) {
                start = end;
                end++;
            }
        }
        return maxPro;
    }
}
