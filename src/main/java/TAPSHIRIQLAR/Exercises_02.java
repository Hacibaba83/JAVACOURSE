/**
 * @Author:
 * @Date: 2024-07-31 19:53:10
 * @LastEditors: 
 * @LastEditTime: 2024-07-31 20:04:47
 * @FilePath: src/main/java/TAPSHIRIQLAR/Exercises_02.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package TAPSHIRIQLAR;

import TAPSHIRIQLAR.Util.MathUtil;

import java.util.Scanner;


public class Exercises_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0 -dan verlmiş ədədə qədər bütün sadə ədədləri çap etmək üçün, ədədi daxil edin!");
        int verilmishEded = sc.nextInt();

        MathUtil.ssadeEdedlerinTapilmasi(verilmishEded);
       
    }
 
}
