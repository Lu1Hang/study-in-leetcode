/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-02 14:01
 * @Description:
 */
public class T345 {

    public String reverseVowels(String s) {
        char[] array = s.toCharArray();
        int l = 0, r = array.length - 1;
        while (l < r) {
            while (l < r && l < array.length && !isaeiou(array[l])) l ++;
            while (l < r && r >= 0 && !isaeiou(array[r])) r--;
            char tmp = array[l];
            array[l] = array[r];
            array[r] = tmp;
            l ++;
            r --;
        }
        return new String(array);
    }

    public boolean isaeiou(char c) {
        c = Character.toLowerCase(c);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return true;
        return false;
    }

    public static void main(String[] args) {
        T345 t345 = new T345();
        System.out.println(t345.reverseVowels("hello"));
    }
}
