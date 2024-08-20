/**
 * @Author:
 * @Date: 2024-07-28 12:56:41
 * @LastEditors: 
 * @LastEditTime: 2024-07-28 13:17:39
 * @FilePath: src/main/java/CONSTRUCTORLAR/MAIN_CONST.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package CONSTRUCTORLAR;

public class MAIN_CONST {
    public static void main(String[] args) {
        USER_CONST u = new USER_CONST();
        u.setName("Azay");

        System.out.println(u.getName());
        System.out.println(u.getSurname());
        System.out.println(u.getAge());
       
        //|||||||||||||||||||
        System.out.println("|||||||||||||");
        new USER_CONST();
        System.out.println(USER_CONST.objectCount);
        //|||||||||||||||||||
        
    }    
}
