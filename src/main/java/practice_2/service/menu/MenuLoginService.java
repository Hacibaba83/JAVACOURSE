/**
 * @Author:
 * @Date: 2024-08-12 19:50:53
 * @LastEditors: 
 * @LastEditTime: 2024-08-14 19:57:08
 * @FilePath: src/main/java/practice_2/service/menu/MenuLoginService.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package practice_2.service.menu;

import practice_2.bean.Config;
import practice_2.service.inter.menu.MenuLoginServiceInter;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {
    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("username");
        String username = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("password");
        String password = sc2.nextLine();
        if ( !(username.equals("user") && password.equals("11111")) ){
            throw new IllegalArgumentException("user or password is invalid");   
        }
        Config.setLeggedIn(true);
    }
}
 