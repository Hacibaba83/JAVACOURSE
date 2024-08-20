/**
 * @Author:
 * @Date: 2024-08-04 13:27:48
 * @LastEditors: 
 * @LastEditTime: 2024-08-14 13:09:43
 * @FilePath: src/main/java/StaticBloklar/Staticler_Main.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package StaticBloklar;

public class Staticler_Main {
    public static void main(String[] args)throws Exception {
        //StasticBloklar.foo();
        Class.forName("StaticBloklar.Staticler_User");
        new Staticler_User();
        new Staticler_User(3);
    }
}
