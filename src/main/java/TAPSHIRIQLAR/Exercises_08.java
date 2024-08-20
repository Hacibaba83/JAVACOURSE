/**
 * @Author:
 * @Date: 2024-08-01 20:34:54
 * @LastEditors: 
 * @LastEditTime: 2024-08-01 20:45:01
 * @FilePath: src/main/java/TAPSHIRIQLAR/Exercises_08.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package TAPSHIRIQLAR;

import TAPSHIRIQLAR.Util.MathUtil;

import java.util.Scanner;

public class Exercises_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int verilmishEded = sc.nextInt();

        System.out.println(MathUtil.verilmishEdedlerinTersiİleMuqayise(verilmishEded));
        
    }
}
