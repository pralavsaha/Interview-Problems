package Blind75.Arrays;
import java.util.*;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] arr) {
        Set<Integer> uniqueSet = new HashSet<>();

        for(int i : arr) {
            if(uniqueSet.contains(i))
                return true;
            uniqueSet.add(i);
        }

        return false;
    }
}
