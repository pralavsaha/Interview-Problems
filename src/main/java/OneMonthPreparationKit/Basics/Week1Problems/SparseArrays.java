package OneMonthPreparationKit.Basics.Week1Problems;
import java.util.*;

public class SparseArrays {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {

        Map<String, Integer> strings_map = new HashMap<>();

        for(String s : strings) {
            if(strings_map.containsKey(s))
                strings_map.put(s,strings_map.get(s)+1);
            else
                strings_map.put(s,1);
        }

        List<Integer> res = new ArrayList<>();

        for(String s : queries) {
            if(strings_map.get(s) == null)
                res.add(0);
            else
                res.add(strings_map.get(s));
        }

        return res;


    }
}
