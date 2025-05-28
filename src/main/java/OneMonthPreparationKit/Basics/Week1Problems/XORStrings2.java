package OneMonthPreparationKit.Basics.Week1Problems;

import java.util.Scanner;

public class XORStrings2 {

    public static String strings_xor(String s, String t) {
        String res = new String("");
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(i))
                res += "0";
            else
                res += "1";
        }

        return res;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        System.out.println(strings_xor(s,t));
    }
}
