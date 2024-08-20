/**
 * @Author:
 * @Date: 2024-08-12 17:30:15
 * @LastEditors: 
 * @LastEditTime: 2024-08-14 18:15:35
 * @FilePath: src/main/java/practice_2/main/Main.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package practice_2.main;


import practice_2.bean.Config;
import practice_2.util.Menu;
import practice_2.util.MenuUtil;

public class Main {
    public static void main(String[] args) {
        Config.initialize();
        
        MenuUtil.showMenu();
    }
}
