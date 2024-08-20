/**
 * @Author:
 * @Date: 2024-07-25 11:05:17
 * @LastEditors: 
 * @LastEditTime: 2024-07-25 11:05:32
 * @FilePath: src/main/java/SWITCH_CASES/SWITCH_CASE.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package SWITCH_CASES;

import CALCULATOR.UTILS.MATH_UTIL;

import java.util.Scanner;

public class SWITCH_CASE {
    public static void main(String[] args) {
        double cavab = calculate();
        System.out.println("hesablamanin neticesi =" + cavab);
    }

    public static double calculate() {
        MATH_UTIL.metn("Sagol");

        Scanner sc = new Scanner(System.in);
        System.out.println("a - ni daxil edin");
        double a = sc.nextDouble();

        System.out.println("b-ni daxil edin");
        double b = sc.nextDouble();

        System.out.println("emeliyyati daxil edin: + 1, - 2, * 3, / 4");
        int operation = sc.nextInt();

        double result = 0;
        switch (operation) {
            case 1:
                result = MATH_UTIL.topla(b, a);
                break;
            case 2:
                result = MATH_UTIL.cix(a, b);
                break;
            case 3:
                result = MATH_UTIL.vur(a, b);
                break;
            case 4:
                result = MATH_UTIL.bol(a, b);
                break;
            default:
                System.out.println("operation is not valid");
                break;
        }
        return result;

    }
}
