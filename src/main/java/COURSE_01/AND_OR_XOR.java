/**
 * @Author:
 * @Date: 2024-07-25 10:56:44
 * @LastEditors: 
 * @LastEditTime: 2024-07-25 10:56:58
 * @FilePath: src/main/java/COURSE_01/AND_OR_XOR.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package COURSE_01;

import java.util.Scanner;

public class AND_OR_XOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a-ni daxil edin: ");
        double a = sc.nextDouble();

        System.out.println("b-ni daxil edin: ");
        double b = sc.nextDouble();

        System.out.println("emeliyyati daxil edin: ");
        int emeliyyat = sc.nextInt();

        double netice;

        //TODO      "||"  "&&"  
        if (emeliyyat == 1 || a == 4) {
            netice = a + b;
        } else {
            netice = 0;
        }
        System.out.println("netice= " + netice);
    }
}
