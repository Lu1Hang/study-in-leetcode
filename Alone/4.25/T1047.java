import java.util.Stack;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-25 19:20
 * @Description:
 */
public class T1047 {

    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if(stack.empty())
                stack.push(S.charAt(i));
            else {
                if(S.charAt(i) == stack.peek())
                    stack.pop();
                else
                    stack.push(S.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder();
        while (!stack.empty()){
            res.insert(0, stack.pop());
        }
        return res.toString();
    }
}
