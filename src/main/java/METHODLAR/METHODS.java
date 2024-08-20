/**
 * @Author:
 * @Date: 2024-07-25 11:03:23
 * @LastEditors: 
 * @LastEditTime: 2024-07-25 11:03:39
 * @FilePath: src/main/java/METHODLAR/METHODS.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package METHODLAR;

public class METHODS {
    public static void main(String[] args) {
        boolean b = foo3("fooo3");
        if (b == true) {
            foo2("fooo2");
        }
    }

    //TODO  METHODLARLA ISHLEMEK
    public static void foo(String s) {
        System.out.println("foo= "+s);
    }

    //TODO  METHODLARDA PARAMETRLERIN GONDERILMESI
    public static String foo2(String s){
        System.out.println("foo2= " + s);
        return "Ishi gordum";
    }

    public static boolean foo3(String s){
        System.out.println("foo3= " + s);
        return true;
    } 
}
