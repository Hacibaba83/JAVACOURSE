/**
 * @Author:
 * @Date: 2024-07-26 10:55:25
 * @LastEditors: 
 * @LastEditTime: 2024-07-26 12:11:04
 * @FilePath: src/main/java/OBYEKTLER_2/Main.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package OBYEKTLER_2;

public class Main {
    public static void main(String[] args) {
        User.companyName = "BSP TECH";
        System.out.println("company name= " + User.companyName);
        
        User u = new User();
        u.name = "Sarkhan";
        u.companyName = "BSP TECH 2";
        
        System.out.println("company name= " + User.companyName);
        System.out.println("u.name= " + u.name);

        User u2 = new User();
        u2.name = "Rauf";
        u2.companyName = "BSP TECH 3";
        
        System.out.println("company name= " + User.companyName);
        System.out.println("u2.name= " + u2.name);

    }

}
