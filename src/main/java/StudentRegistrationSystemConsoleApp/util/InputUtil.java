/**
 * @Author:
 * @Date: 2024-08-03 18:11:20
 * @LastEditors: 
 * @LastEditTime: 2024-08-03 18:33:59
 * @FilePath: src/main/java/StudentRegistrationSystemConsoleApp/util/InputUtil.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package StudentRegistrationSystemConsoleApp.util;

import java.util.Scanner;

public class InputUtil {

    public static String requireText(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.println(title + ":");
        String answer = sc.nextLine();
        return answer;
    }

    public static int requireNumber(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.println(title + ":");
        int answer = sc.nextInt();
        return answer;
    }
}
