package Stack;
import java.util.Stack;

public class StringReverse {
    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        char[] chars = str.toCharArray();

        for(char c : chars) {
            s.push(c);
        }

        for(int i=0; i<str.length() ;i++) {
            chars[i] = s.pop();
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println("After reverse" + str);
        System.out.println("before reverse" + reverse(str));

    }
}