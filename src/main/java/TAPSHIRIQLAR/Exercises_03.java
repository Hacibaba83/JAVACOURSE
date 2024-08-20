/**
 * @Author:
 * @Date: 2024-07-31 20:43:29
 * @LastEditors: 
 * @LastEditTime: 2024-07-31 20:58:47
 * @FilePath: src/main/java/TAPSHIRIQLAR/Exercises_03.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package TAPSHIRIQLAR;

import TAPSHIRIQLAR.Util.MathUtil;

import java.util.Scanner;

public class Exercises_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int verilmishEded = sc.nextInt();
        MathUtil.verilenReqenlerinCemi(verilmishEded);
    }
}
