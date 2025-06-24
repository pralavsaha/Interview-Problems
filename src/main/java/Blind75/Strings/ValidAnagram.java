package Blind75.Strings;

public class ValidAnagram {

    public static boolean validAnagram(String s , String t) {
        int[] arr = new int[26];

        for(int c: s.toCharArray())
            arr[c - 'a']++;

        for(int c: t.toCharArray())
            arr[c-'a']--;

        for(int i=0;i<26;i++) {
            if(arr[i] != 0)
                return false;
        }
        return true;
    }
}
