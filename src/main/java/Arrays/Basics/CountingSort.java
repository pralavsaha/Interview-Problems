package Arrays.Basics;
import java.util.*;

public class CountingSort {

    public static List<Integer> countingSort(int[] arr) {

        int[] freq = new int[100];

        for(int i: arr)
            freq[i]++;

        List<Integer> res = new ArrayList<>();

        for(int count : freq)
            res.add(count);

        return res;

    }
}
