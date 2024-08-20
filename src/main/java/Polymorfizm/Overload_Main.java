/**
 * @Author:
 * @Date: 2024-08-04 17:26:02
 * @LastEditors: 
 * @LastEditTime: 2024-08-04 17:48:15
 * @FilePath: src/main/java/Polymorfizm/Overload_Main.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package Polymorfizm;

public class Overload_Main {

    public static void main(String[] args) {
        Overload_Serxan s = new Overload_Serxan();
        method(s);
    }

    public static void method(Overload_Serxan s){
        System.out.println("Serxan");
    }

    public static void method(Polymorfizm_Azay a) {
        System.out.println("Azay");
    }

    public static void method(Polymorfizm_X x) {
        System.out.println("X");
    }

    public static void method(Object o) {
        System.out.println("Object");
    }

}
