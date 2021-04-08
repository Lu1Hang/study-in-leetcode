/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-08 15:08
 * @Description:
 */
public class T744 {

    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0, r = letters.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if(letters[mid] <= target)//可能会存在重复情况
                l = mid + 1;
            else
                r = mid - 1;
        }
        return letters[l % letters.length];
    }

    public static void main(String[] args) {
        T744 t744 = new T744();
        System.out.println(t744.nextGreatestLetter(new char[]{'c', 'f', 'g'}, 'c'));
    }
}
