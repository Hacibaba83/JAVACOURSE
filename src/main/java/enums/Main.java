/**
 * @Author:
 * @Date: 2024-08-10 18:41:09
 * @LastEditors: 
 * @LastEditTime: 2024-08-12 20:57:49
 * @FilePath: src/main/java/enums/Main.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package enums;

public class Main {
    public static void main(String[] args) {
        EMELIYYAT e = EMELIYYAT.TOPLA;
        System.out.println(e.hesabla(5, 6));
        
        System.out.println(e.getClass().getName());
        System.out.println(e.getClass().getSuperclass().getName());
        System.out.println(e.getClass().getInterfaces().length);
        
        
    }
}
