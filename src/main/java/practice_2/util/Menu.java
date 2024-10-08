/**
 * @Author:
 * @Date: 2024-08-12 18:45:19
 * @LastEditors: 
 * @LastEditTime: 2024-08-14 20:00:16
 * @FilePath: src/main/java/practice_2/util/Menu.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package practice_2.util;

import practice_2.bean.Config;
import practice_2.service.inter.Process;
import practice_2.service.menu.*;

public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    DD_TEACHER(3, "Add teacher", new MenuAddTeacherService()),
    ADD_STUDENT(4, "Add student", new MenuAddStudentServie()),
    SHOW_ALL_TEACHER(5, "Show all teachers", new MenuShowTeacerService()),
    SHOW_ALL_STUDENT(6, "Show all students", new MenuShowStudentsSerive()),
    UNKNOWN;

    private int number;
    private String label;
    private Process service;

    Menu(int number, String label, Process service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }

    Menu() {

    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return number + "." + label;
    }

    public void process() {
        service.process();
        MenuUtil.showMenu();
    }

    public int getNumber() {
        return this.number;
    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != UNKNOWN) {
                if (menus[i] == LOGIN || menus[i] == REGISTER) {
                    if (!Config.isLeggedIn()) {
                        System.out.println(menus[i]);
                    }
                } else if (Config.isLeggedIn()) {
                    System.out.println(menus[i]);
                }
            }
        }
    }
}


