/**
 * @Author:
 * @Date: 2024-07-27 13:20:14
 * @LastEditors: 
 * @LastEditTime: 2024-07-27 13:27:50
 * @FilePath: src/main/java/OBYEKT_ICHI_OBYEKT/Main.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package OBYEKT_ICHI_OBYEKT;

public class Main {
    public static void main(String[] args) {
        User  u = new User();
        u.name = "Sarkhan";
        
    //TODO COMPOSITION VIR YERE GETIRME
        Student s = new Student();
        s.name = "Rashid";
        
        //TODO      OBYEKT ICHINDE OBYEKT
        u.student = s;

        System.out.println(u.student.name);
    }
}
