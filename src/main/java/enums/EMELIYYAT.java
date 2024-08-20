/**
 * @Author:
 * @Date: 2024-08-10 18:48:06
 * @LastEditors: 
 * @LastEditTime: 2024-08-12 20:59:51
 * @FilePath: src/main/java/enums/EMELIYYAT.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package enums;

public enum EMELIYYAT {
    TOPLA('/'), CIX('-'), VUR('*'), BOL('/');

    private char c;

    EMELIYYAT() {

    }

    public char getOperationSimvol() {
        return this.c;
    }

    EMELIYYAT(char c) {
        this.c = c;
    }
    
    public double hesabla(double a, double b) {
        if (c == '+') {
            return a + b;
        }
        return -1;
    }

}