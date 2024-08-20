/**
 * @Author:
 * @Date: 2024-07-25 11:03:10
 * @LastEditors: 
 * @LastEditTime: 2024-07-25 11:03:16
 * @FilePath: src/main/java/METHODLAR/MAIN_CLASS.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package METHODLAR;

public class MAIN_CLASS {
    public static void main(String[] args) {
        boolean b = METHODS.foo3("fooo3");
        if (b == true) {
            METHODS.foo2("fooo2");
        }
    }
}
