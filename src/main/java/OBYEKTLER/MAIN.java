/**
 * @Author:
 * @Date: 2024-07-25 21:37:34
 * @LastEditors: 
 * @LastEditTime: 2024-07-25 22:09:45
 * @FilePath: src/main/java/OBYEKTLER/MAIN.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package OBYEKTLER;

public class MAIN {
    
    public static USER u = new USER();
    
    public static void main(String[] args) {
        
        USER.umumi = "Salam";
        USER.foo();

        USER u = new USER();
        u.name = "Hacibaba";

        USER u2 = new USER();
        u2.name = "Samir";
        
        TEST.deyish();

        System.out.println(u.name);
        System.out.println(u2.name);
        System.out.println(USER.umumi);
    }
}
