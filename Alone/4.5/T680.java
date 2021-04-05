/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-04 20:47
 * @Description:
 */
public class T680 {

    public boolean validPalindrome(String s) {
        char[] array = s.toCharArray();
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            if(array[i] != array[j]){
                return isPalindrome(array, i + 1, j) || isPalindrome(array, i, j - 1);
            }
        }
        return true;
    }

    public boolean isPalindrome(char[] array, int l, int r){
        while (l < r) {
            if(array[l] != array[r])
                return false;
            l++;
            r--;
        }
        return true;
    }
}
