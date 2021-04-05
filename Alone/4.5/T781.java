import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-05 13:12
 * @Description:
 */
public class T781 {

    /**
     * 贪心
     * 同一颜色的兔子回答的数值一样
     * 回答同一数值的不一定是同颜色的兔子
     * 当t<=cnt+1时，还需要添加cnt-t只与其同颜色的兔子
     * 当t>cnt+1时，跳过cnt只兔子
     * @param answers
     * @return
     */
    public int numRabbits(int[] answers) {
        Arrays.sort(answers);
        int ans = 0;
        for (int i = 0; i < answers.length; i++) {
            int j = answers[i];
            ans += (j + 1);
            while (j-- > 0 && i + 1 < answers.length && answers[i] == answers[i + 1]) i++;
        }
        return ans;
    }
}
