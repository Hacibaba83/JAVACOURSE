/**
 * @Author:
 * @Date: 2024-08-03 17:23:52
 * @LastEditors: 
 * @LastEditTime: 2024-08-03 21:58:27
 * @FilePath: src/main/java/StudentRegistrationSystemConsoleApp/main/Main.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package StudentRegistrationSystemConsoleApp.main;

import StudentRegistrationSystemConsoleApp.util.InputUtil;
import StudentRegistrationSystemConsoleApp.util.MenuUtil;

public class Main {
    public static void main(String[] args) {

        int menu = 0;

        while (true) {
            menu = InputUtil.requireNumber("What do you want to do?" + "\n1. Register Student" + "\n2. Show all Student" + "\n3. Find Student" + "\n4. Update Student" + "\n5. EXIT");
            MenuUtil.processMenu(menu);
        }
    }
}
