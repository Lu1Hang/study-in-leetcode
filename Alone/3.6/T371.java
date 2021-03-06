/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-06 17:00
 * @Description:
 */
public class T371 {
    public int getSum(int a, int b) {
        while (b != 0) {
            //不进位
            int tmp = a ^ b;
            //进位
            b = (a & b) << 1;
            a = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        T371 t371 = new T371();
        System.out.println(t371.getSum(1, 2));
    }
}
