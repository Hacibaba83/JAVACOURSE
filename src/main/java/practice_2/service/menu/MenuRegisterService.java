/**
 * @Author:
 * @Date: 2024-08-12 19:56:41
 * @LastEditors: 
 * @LastEditTime: 2024-08-14 19:57:08
 * @FilePath: src/main/java/practice_2/service/menu/MenuRegisterService.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package practice_2.service.menu;

import practice_2.service.inter.menu.MenuRegisterServiceInter;

public class MenuRegisterService implements MenuRegisterServiceInter {

    @Override
    public void processLogic() {
        System.out.println("register");
    }
}
