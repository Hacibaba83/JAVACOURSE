/**
 * @Author:
 * @Date: 2024-08-03 21:37:54
 * @LastEditors: 
 * @LastEditTime: 2024-08-03 21:58:27
 * @FilePath: src/main/java/StudentRegistrationSystemConsoleApp/util/MenuUtil.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package StudentRegistrationSystemConsoleApp.util;

public class MenuUtil {

    public static void processMenu(int selectedMenu) {

        //            if (selectedMenu == 1) {
        //                StudentUtil.registerStudents();
        //            } else if (selectedMenu == 2) {
        //                StudentUtil.printAllRegisteredStudents();
        //            } else if (selectedMenu == 3) {
        //                StudentUtil.findStudentAndPrint();
        //            } else if (selectedMenu == 4) {
        //                StudentUtil.updateStudentWithSplit();
        //            }

        switch (selectedMenu) {
            case 1:
                StudentUtil.registerStudents();
                break;
            case 2:
                StudentUtil.printAllRegisteredStudents();
                break;
            case 3:
                StudentUtil.findStudentAndPrint();
                break;
            case 4:
                StudentUtil.updateStudentWithSplit();
                break;
            case 5:
               System.exit(0);
                break;
            default:
                break;
        }
    }

    public static String requireName() {
        return InputUtil.requireText("enter name");
    }

    public static String requireSurname() {
        return InputUtil.requireText("enter surname");
    }

    public static String requireClassName() {
        return InputUtil.requireText("enter class name");
    }

    public static int requireAge() {
        return InputUtil.requireNumber("enter age");
    }

    public static void showSuccesOpMessage() {
        System.out.println("operation completed succesfully");
    }
}
