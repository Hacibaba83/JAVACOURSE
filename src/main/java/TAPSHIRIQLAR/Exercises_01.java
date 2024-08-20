/**
 * @Author:
 * @Date: 2024-07-31 12:14:54
 * @LastEditors: 
 * @LastEditTime: 2024-07-31 19:31:59
 * @FilePath: src/main/java/TAPSHIRIQLAR/Exercises_01.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package TAPSHIRIQLAR;


import TAPSHIRIQLAR.Util.MathUtil;

import java.util.Scanner;

public class Exercises_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0 -dan verlmiş ədədə qədər bütün 2-yə bölünən ədədləri çap etmək üçün, ədədi daxil edin!");
        int verilmishEded = sc.nextInt();

        MathUtil.ikiyeBolunenleriTapmaq(verilmishEded);
        MathUtil.bolunenleriTapmaq(verilmishEded, 3);
    }
}
