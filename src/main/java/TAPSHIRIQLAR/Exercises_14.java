/**
 * @Author:
 * @Date: 2024-08-02 18:46:07
 * @LastEditors: 
 * @LastEditTime: 2024-08-02 18:53:27
 * @FilePath: src/main/java/TAPSHIRIQLAR/Exercises_14.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package TAPSHIRIQLAR;

public class Exercises_14 {
    public static void main(String[] args) {
        String metn = new String("salam");
        char herif = 'd';
        int count = 5;

        foo(metn, herif, count);
    }

    public static void foo(String s, char h, int c) {
        StringBuffer str = new StringBuffer(s);
    
        for (int i = 0; i <= c; i++) {
            str.append(h);
        }
        System.out.println(str);
    }
}
