package OneMonthPreparationKit.Basics.Week2Problems;

public class CaesarCipher {

    public static String caesarCipher(String s, int k) {
        StringBuilder res = new StringBuilder();
        k = k % 26;

        for(char c : s.toCharArray()) {
            if(Character.isUpperCase(c)) {
                char ch = (char) (((c - 'A' + k) % 26) + 'A');
                res.append(ch);
            }
            else if(Character.isLowerCase(c)) {
                char ch = (char) (((c - 'a' + k) % 26) + 'a');
                res.append(ch);
            }
            else {
                res.append(c);
            }
        }

        return res.toString();

    }
}
