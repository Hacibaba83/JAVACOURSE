/**
 * @Author:
 * @Date: 2024-07-25 11:04:19
 * @LastEditors: 
 * @LastEditTime: 2024-07-25 11:04:30
 * @FilePath: src/main/java/STRINGS/STRING.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package STRINGS;

import java.util.Scanner;

public class STRING {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("metni daxil edin");
        String s = sc.nextLine();

        int i = s.length();
        System.out.println("legth = " + i);

        char c1 = s.charAt(s.length() - 1);
        System.out.println("last symbol = " + c1);

        String substring = s.substring(1, 3);
        System.out.println("substring = " + substring);

        boolean b = s.contains("al");
        System.out.println("contains = " + b);

        boolean b2 = s.equals("salam");
        System.out.println("equals = " + b2);

        boolean b6 = s.equalsIgnoreCase("salam");
        System.out.println("equal ignore case = " + b6);

        boolean b3 = s.isEmpty();
        System.out.println("is empty = " + b3);

        boolean b4 = s.startsWith("Sa");
        System.out.println("start with = " + b4);

        boolean b5 = s.endsWith("am");
        System.out.println("endwith = " + b5);

        String ss = s.trim();
        System.out.println("trim = " + ss);

        String lower = s.toLowerCase();
        System.out.println("lower = " + lower);

        String uper = s.toUpperCase();
        System.out.println("upper = " + uper);

        int index = s.indexOf("am");
        System.out.println("index of = " + index);

        int lastIndex = s.lastIndexOf("a");
        System.out.println("last index of \"a\" = " + lastIndex);

        String replace = s.replace("Sa", "as");
        System.out.println("replace = " + replace);

    }
}
