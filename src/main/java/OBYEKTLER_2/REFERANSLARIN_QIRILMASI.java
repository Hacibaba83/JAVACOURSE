/**
 * @Author:
 * @Date: 2024-07-26 12:33:46
 * @LastEditors: 
 * @LastEditTime: 2024-07-26 16:18:04
 * @FilePath: src/main/java/OBYEKTLER_2/REFERANSLARIN_QIRILMASI.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package OBYEKTLER_2;

public class REFERANSLARIN_QIRILMASI {

    public static void main(String[] args) {
        //TODO      REGERANSLARIN QIRILMASI
        User u = null;
        //System.out.println(u.name);
        System.out.println(u.companyName);
        
        u = new User();
        u.name = "SARKHAN";//TODO       REFERNCE 
        System.out.println(u.companyName);
        System.out.println(u.name);
        
        u = new User();
        System.out.println(u.name);
        System.out.println(u.companyName);

        System.out.println("|||||||||||||||||||||||||");
        u= new User();
        System.out.println(u.name);
        change(u);
        System.out.println(u.name);
        
        int i = 0;
        i = changeINT(i);
        System.out.println(i);
        
    }
    
    public static void change(User u){
        u.name = "changed";
    }

    public static int changeINT(int j){
        j = 5;
        return j;
    }

}
