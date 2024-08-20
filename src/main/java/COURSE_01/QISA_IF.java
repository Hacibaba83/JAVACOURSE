/**
 * @Author:
 * @Date: 2024-07-25 10:59:47
 * @LastEditors: 
 * @LastEditTime: 2024-07-25 11:00:02
 * @FilePath: src/main/java/COURSE_01/QISA_IF.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package COURSE_01;

public class QISA_IF {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int netice = 0;

        if (a != b) {
            netice = a + b;
        } else {
            netice = 0;
        }
        //TODO QISA IF YAZILISHI
        netice = (a != b) ? a + b : 0;


        if (!(a == b)) //TODO EGER SHERT ODENERSE HER IKI SETIR CAP EDILIR
            System.out.println("a, b -ye beraberdir");
        System.out.println("a bbb");

    }
}
