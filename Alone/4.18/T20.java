import java.util.Stack;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-18 14:54
 * @Description:
 */
public class T20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(!stack.empty() && s.charAt(i) == ')' && stack.peek() == '(')
                stack.pop();
            else if(!stack.empty() && s.charAt(i) == '}' && stack.peek() == '{')
                stack.pop();
            else if(!stack.empty() && s.charAt(i) == ']' && stack.peek() == '[')
                stack.pop();
            else
                stack.push(s.charAt(i));
        }
        return stack.empty() ? true : false;
    }

    public static void main(String[] args) {
        T20 t20 = new T20();
        System.out.println(t20.isValid("()"));
    }
}
