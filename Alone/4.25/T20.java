import java.util.Stack;

public class T20 {

    /**
     * @Author Alone
     * @Description 二刷
     * @Date  2021/4/25 15:48
     * @Param [java.lang.String]
     * @return boolean
     **/
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(stack.empty())
                stack.push(s.charAt(i));
            else {
                if(s.charAt(i) == ')' && stack.peek() == '('){
                    stack.pop();
                } else if(s.charAt(i) == '}' && stack.peek() == '{'){
                    stack.pop();
                } else if(s.charAt(i) == ']' && stack.peek() == '[') {
                    stack.pop();
                } else
                    stack.push(s.charAt(i));
            }
        }
        return stack.empty() ? true : false;
    }
}