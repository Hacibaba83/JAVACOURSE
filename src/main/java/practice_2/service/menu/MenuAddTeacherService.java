/**
 * @Author:
 * @Date: 2024-08-14 14:30:06
 * @LastEditors: 
 * @LastEditTime: 2024-08-14 19:57:08
 * @FilePath: src/main/java/practice_2/service/menu/MenuAddTeacherService.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package practice_2.service.menu;

import practice_2.bean.Config;
import practice_2.bean.Teacher;
import practice_2.service.inter.menu.MenuAddTeacherServiceInter;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {

    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter surname");
        String surname = sc.nextLine();

        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);

        Config.instance().appendTeacher(t);
        System.out.println("Teacher added");

    }
}
