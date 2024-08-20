/**
 * @Author:
 * @Date: 2024-08-10 19:09:44
 * @LastEditors: 
 * @LastEditTime: 2024-08-10 19:14:56
 * @FilePath: src/main/java/enums/EMELIYYAT2.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package enums;

public class EMELIYYAT2 {
    
    public static final EMELIYYAT2 TOPLA = new EMELIYYAT2('+');
    public static final EMELIYYAT2 CIX = new EMELIYYAT2('-');
    public static final EMELIYYAT2 VUR = new EMELIYYAT2('*');
    public static final EMELIYYAT2 BOL = new EMELIYYAT2('/');

    private char c;

    EMELIYYAT2() {

    }

    EMELIYYAT2(char c) {
        this.c = c;
    }

    public char getOperationSimvol() {
        return this.c;
    }

    public double hesabla(double a, double b) {
        if (c == '+') {
            return a + b;

        }
        return -1;
    }
}
