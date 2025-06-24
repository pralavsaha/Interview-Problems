package Blind75.Strings;
import java.util.Stack;

public class ValidParantheses {

    public static boolean validParantheses(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(st.empty())
                st.push(ch);
            else if(st.peek() == '(' && ch == ')')
                st.pop();
            else if(st.peek() == '{' && ch == '}')
                st.pop();
            else if(st.peek() == '[' && ch == ']')
                st.pop();
            else
                st.push(ch);
        }
        return st.size() == 0 ? true : false;
    }
}
