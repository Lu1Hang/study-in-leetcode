import java.util.ArrayDeque;
import java.util.Deque;

public class T150 {

    /**
     * @Author Alone
     * @Description 二刷
     * @Date  2021/4/25 19:27
     * @Param [java.lang.String[]]
     * @return int
     **/
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < tokens.length; i++) {
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                Integer num1 = stack.pop();
                Integer num2 = stack.pop();
                if(tokens[i].equals("+"))
                    stack.push(num1 + num2);
                else if(tokens[i].equals("-"))
                    stack.push(num2 - num1);
                else if(tokens[i].equals("*"))
                    stack.push(num1 * num2);
                else if(tokens[i].equals("/"))
                    stack.push(num2 / num1);
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}