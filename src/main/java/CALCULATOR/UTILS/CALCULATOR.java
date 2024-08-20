/**
 * @Author:
 * @Date: 2024-07-25 10:54:24
 * @LastEditors: 
 * @LastEditTime: 2024-07-25 10:55:11
 * @FilePath: src/main/java/CALCULATOR/UTILS/CALCULATOR.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package CALCULATOR.UTILS;

import java.util.Scanner;

public class CALCULATOR {
    public static void main(String[] args) {
        calculate();
    }

    public static double calculate() {
        Scanner sc = new Scanner(System.in);

        System.out.println("a - ni daxil edin:");
        double a = sc.nextDouble();

        System.out.println("b - ni daxil edin:");
        double b = sc.nextDouble();

        System.out.println("emeliyyati daxil edin: + 1, - 2, * 3, / 4");
        double operation = sc.nextInt();

        double result = 0;

        if (operation == 1) {
            result = MATH_UTIL.topla(a, b);
        } else if (operation == 2) {
            result = MATH_UTIL.cix(a, b);
        } else if (operation == 3) {
            result = MATH_UTIL.vur(a, b);
        } else if (operation == 4) {
            result = MATH_UTIL.bol(a, b);
        } else {
            System.out.println("operation is not found");
        }
        return result;
    }
}
