/**
 * @Author:
 * @Date: 2024-08-02 20:08:59
 * @LastEditors: 
 * @LastEditTime: 2024-08-02 20:17:25
 * @FilePath: src/main/java/TAPSHIRIQLAR/Exercises_16.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package TAPSHIRIQLAR;

public class Exercises_16 {
    public static void main(String[] args) {
        String a = new String("Hello World");
        int begin = 3;
        int end = 7;
        foo(a, begin, end);
    }

    public static void foo(String a, int begin, int end) {
        String metn = a.substring(begin, end);
        for(int i = 0; i<=metn.length()-1; i++){
            System.out.println(metn.charAt(i));  
        }
        
    }
}
