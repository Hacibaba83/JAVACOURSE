/**
 * @Author:
 * @Date: 2024-08-01 20:54:46
 * @LastEditors: 
 * @LastEditTime: 2024-08-01 21:48:04
 * @FilePath: src/main/java/TAPSHIRIQLAR/Exercises_09.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package TAPSHIRIQLAR;

import java.util.Scanner;

public class Exercises_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int verilmishEded = sc.nextInt();

        int a = 1;
        int b = 5;

        verimishEdediDerceYukselt(a, b, verilmishEded);


    }

    public static void verimishEdediDerceYukselt(long a, long b, int c) {


        for (long s = a; s <= b; s++) {
            long q = s;
            System.out.println(Math.pow(q, 3));
             q = s;
             long v = s;
            for (long j = 1; j < c; j++) {
                v = v * q;
                
            }
            System.out.println(v);
            a++;
        }
    }
}
