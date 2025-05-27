package Arrays.Basics.Week1Mock;

import java.util.Collections;
import java.util.List;

public class FindTheMedian {

    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        return arr.get(arr.size()/2);

    }
}
