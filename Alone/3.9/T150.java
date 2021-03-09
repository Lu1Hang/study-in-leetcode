import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-09 09:41
 * @Description:
 */
public class T150 {

    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if(!judge(token)){
                stack.push(Integer.parseInt(token));
            } else {
                Integer num1 = stack.pop();
                Integer num2 = stack.pop();
                if(token.equals("+"))
                    num2 += num1;
                else if(token.equals("-"))
                    num2 -= num1;
                else if(token.equals("*"))
                    num2 *= num1;
                else if(token.equals("/"))
                    num2 /= num1;
                stack.push(num2);
            }
        }
        return stack.pop();
    }

    public boolean judge(String s) {
        if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
            return true;
        else
            return false;
    }


}
