package Blind75.Arrays;

public class SearchInSortedArray {

    public static int sortedArray(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;

        while(low <= high) {
            int mid = (low+high)/2;

            if(target == arr[mid])
                return mid;
            if(arr[low] <= arr[mid]) {
                if(arr[low] <= target && target <= arr[mid])
                    high  = mid-1;
                else
                    low = mid+1;
            }
            else {
                if(arr[mid] <= target && target <= arr[high])
                    low = mid+1;
                else
                    high = mid-1;
            }
        }
        return -1;
    }
}
