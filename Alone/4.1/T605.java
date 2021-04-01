/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-01 10:16
 * @Description:
 */
public class T605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //每次跳两格,当当前格为1，其后一位必为0，直接跳过两格
        //当当前格为0，判断其后一位是否为1，如果为1当前格就不能种，直接跳3格，不为1就可以种
        for (int i = 0; i < flowerbed.length && n > 0; i += 2) {
            if(flowerbed[i] == 0){
                if(i + 1 < flowerbed.length && flowerbed[i + 1] == 1)
                    i ++;
                else
                    n --;
            }
        }
        return n == 0 ? true : false;
    }
}
