package Blind75.Strings;
import java.util.*;
public class MinimumWindowSubstring {

    public static String minWindow(String s , String t) {
        Map<Character, Integer> need  = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for(int i = 0; i < t.length();i++) {
            char c = t.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int valid = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while(right < s.length()) {

            char ch = s.charAt(right);
            right++;

            if(need.containsKey(ch)) {
                window.put(ch ,window.getOrDefault(ch, 0)+1);
                if(window.get(ch).intValue() ==  need.get(ch).intValue())
                    valid++;
            }

            while(valid == need.size()) {
                if(right-left < minLen) {
                    start = left;
                    minLen = right - left;
                }

                char d = s.charAt(left);
                left++;

                if(need.containsKey(d)) {
                    if(window.get(d).intValue() == need.get(d).intValue())
                        valid--;
                    window.put(d,window.get(d) - 1);
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start+minLen);
    }
}
