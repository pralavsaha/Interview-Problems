package Arrays.Basics;
import java.util.*;

public class Pangrams {

    public static String pangrams(String s) {
        // Write your code here
        String temp_str = s.toLowerCase();
        Set<Character> default_set = new HashSet<>();
        Set<Character> res_set = new HashSet<>();

        for(char c = 'a';c<='z';c++)
            default_set.add(c);

        for(int i=0;i<temp_str.length();i++) {
            if(temp_str.charAt(i) != ' ') {
                res_set.add(temp_str.charAt(i));
            }
        }

        if(default_set.equals(res_set))
            return "pangram";
        else
            return "not pangram";
    }
}
