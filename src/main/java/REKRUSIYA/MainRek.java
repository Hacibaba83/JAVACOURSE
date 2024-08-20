/**
 * @Author:
 * @Date: 2024-07-28 13:18:38
 * @LastEditors: 
 * @LastEditTime: 2024-07-28 14:06:42
 * @FilePath: src/main/java/REKRUSIYA/MainRek.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package REKRUSIYA;

public class MainRek {
    public static void main(String[] args) {
        foo();
    }

    //TODO      REKRUSİYA OZ OZUNU TEKRAR TEKRA CHAGRİLMAGİNA DEYİLİR
    public static void foo() {
        UserRek u = new UserRek();

        System.out.println("|||||||||||||||||||");
        System.out.println(u.getName());

        System.out.println("|||||||||||||||||||");
        foo2();
        System.out.println("foo");
        System.out.println(UserRek.objectCount);
        
    }

    public static void foo2() {
        foo3();
        System.out.println("foo2");
    }

    public static void foo3() {
        System.out.println("foo3");
    }

}
