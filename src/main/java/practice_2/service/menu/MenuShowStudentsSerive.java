/**
 * @Author:
 * @Date: 2024-08-14 14:31:40
 * @LastEditors: 
 * @LastEditTime: 2024-08-14 19:57:07
 * @FilePath: src/main/java/practice_2/service/menu/MenuShowStudentsSerive.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package practice_2.service.menu;

import practice_2.bean.Config;
import practice_2.bean.Student;
import practice_2.service.inter.menu.MenuShowStudentsServiceInter;

public class MenuShowStudentsSerive implements MenuShowStudentsServiceInter {

    @Override
    public void processLogic() {
        Student[] allStudent = Config.instance().getStudents();
        for (int i = 0; i < allStudent.length; i++) {
            System.out.println(allStudent[i]); 
        }
    }
}
