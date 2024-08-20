/**
 * @Author:
 * @Date: 2024-08-14 14:30:27
 * @LastEditors: 
 * @LastEditTime: 2024-08-14 19:57:08
 * @FilePath: src/main/java/practice_2/service/menu/MenuAddStudentServie.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package practice_2.service.menu;

import practice_2.bean.Config;
import practice_2.bean.Student;
import practice_2.service.inter.menu.MenuAddStudentServiceInter;

import java.util.Scanner;

public class MenuAddStudentServie implements MenuAddStudentServiceInter {
    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();
      
        System.out.println("enter surname");
        Scanner sc2 = new Scanner(System.in);
        String surname = sc.nextLine();

        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);

        Config.instance().appendStudent(s);
        System.out.println("Student added");

    }
}
