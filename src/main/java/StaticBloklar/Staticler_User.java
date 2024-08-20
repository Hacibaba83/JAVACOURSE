/**
 * @Author:
 * @Date: 2024-08-04 13:26:50
 * @LastEditors: 
 * @LastEditTime: 2024-08-04 14:14:00
 * @FilePath: src/main/java/StaticBloklar/Staticler_User.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package StaticBloklar;

public class Staticler_User {
    static {
        System.out.println("Static bloklar");
    }
    
    public static void foo(){
        System.out.println("metod foo");
    }
    {
        System.out.println("non static");
    }
    
    public Staticler_User(){
        System.out.println("User");
    }

    public Staticler_User(int a){
        System.out.println("User a");
    }
}
