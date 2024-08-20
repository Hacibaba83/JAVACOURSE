/**
 * @Author:
 * @Date: 2024-07-31 21:12:43
 * @LastEditors: 
 * @LastEditTime: 2024-07-31 21:18:39
 * @FilePath: src/main/java/TAPSHIRIQLAR/Exercises_05.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package TAPSHIRIQLAR;

import TAPSHIRIQLAR.Util.MathUtil;

import java.util.Scanner;

public class Exercises_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededidaxil edin");

        int verilmishEded = sc.nextInt();
        MathUtil.verilmishEdedinReqemSayi(verilmishEded);
    }
}
