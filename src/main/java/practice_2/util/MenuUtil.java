/**
 * @Author:
 * @Date: 2024-08-12 17:59:05
 * @LastEditors: 
 * @LastEditTime: 2024-08-14 17:56:28
 * @FilePath: src/main/java/practice_2/util/MenuUtil.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package practice_2.util;

import java.util.Scanner;

public class MenuUtil {

    public static void showMenu() {

        System.out.println("Please select menu");
       
        Menu.showAllMenu();

        Scanner sc = new Scanner(System.in);
        int selectedMenuNumber = sc.nextInt();

        Menu selectedMenu =  Menu.find(selectedMenuNumber);

        selectedMenu.process();
    }

    public static void processMenu(Menu menu) {
        menu.process();
    }
}
