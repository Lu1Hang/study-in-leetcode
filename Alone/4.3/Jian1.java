/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-03 19:18
 * @Description:
 */
public class Jian1 {

    /**
     * 从左下角开始找
     * @param target
     * @param array
     * @return
     */
    public boolean Find(int target, int [][] array) {
        int stx = array.length - 1, sty = 0;
        while (stx >= 0 && sty <= array[0].length - 1){
            if(target == array[stx][sty])
                return true;
            else if(target > array[stx][sty])
                sty ++;
            else stx --;
        }
        return false;
    }
}
