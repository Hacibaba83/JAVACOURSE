/**
 * @Author:
 * @Date: 2024-08-08 16:57:02
 * @LastEditors: 
 * @LastEditTime: 2024-08-08 18:32:22
 * @FilePath: src/main/java/pattern/singelstone/Main.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package pattern.singelstone;

public class Main {
    public static void main(String[] args) {
        Fanar f =  Fanar.instance();
        f.drive();
        
    }
}
