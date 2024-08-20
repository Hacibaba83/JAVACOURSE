/**
 * @Author:
 * @Date: 2024-07-31 21:22:09
 * @LastEditors: 
 * @LastEditTime: 2024-07-31 21:37:50
 * @FilePath: src/main/java/TAPSHIRIQLAR/Exercises_06.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package TAPSHIRIQLAR;

import TAPSHIRIQLAR.Util.MathUtil;

import java.util.Scanner;

public class Exercises_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int verilmishEded = sc.nextInt();

        MathUtil.sadeFactorial(verilmishEded);

        System.out.println("Recrussion factorial = "+ MathUtil.recrussionFactorial(verilmishEded));
    }

}
