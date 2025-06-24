package Blind75.Strings;
import java.util.*;
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();

        for(String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedArray = new String(chars);

            if(!map.containsKey(sortedArray)) {
                map.put(sortedArray, new ArrayList<>());
            }

            map.get(sortedArray).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
