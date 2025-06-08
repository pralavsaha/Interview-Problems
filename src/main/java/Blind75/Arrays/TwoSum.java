package Blind75.Arrays;
import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {
        Map<Integer,Integer> addMap = new HashMap<>();
        for(int num=0;num<arr.length;num++) {

            if(addMap.containsKey(target-arr[num]))
                return new int[]{addMap.get(target-arr[num]),num};
            else
                addMap.put(arr[num],num);
        }
        return new int[]{};
    }
}
