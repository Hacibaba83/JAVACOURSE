/**
 * @Author:
 * @Date: 2024-08-14 14:32:00
 * @LastEditors: 
 * @LastEditTime: 2024-08-14 19:57:07
 * @FilePath: src/main/java/practice_2/service/menu/MenuShowTeacerService.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package practice_2.service.menu;

import practice_2.bean.Config;
import practice_2.bean.Teacher;
import practice_2.service.inter.menu.MenuShowTeacherServiceInter;

public class MenuShowTeacerService implements MenuShowTeacherServiceInter {
    @Override
    public void processLogic() {
        Teacher[] allTeacher = Config.instance().getTeachers();
        for (int i = 0; i < allTeacher.length; i++) {
            System.out.println(allTeacher[i]);
        }
    }
}
