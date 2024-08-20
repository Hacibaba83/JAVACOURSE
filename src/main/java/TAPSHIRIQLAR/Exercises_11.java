/**
 * @Author:
 * @Date: 2024-08-02 16:01:08
 * @LastEditors: 
 * @LastEditTime: 2024-08-02 16:38:53
 * @FilePath: src/main/java/TAPSHIRIQLAR/Exercises_11.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package TAPSHIRIQLAR;

import java.util.Scanner;

public class Exercises_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("4 reqem daxil edin zehmet olmasa");

        int[] mass = new int[4];

        for (int i = 0; i <= 3; i++) {
            int verilmishEded = sc.nextInt();
            mass[i] = verilmishEded;
        }
        String ardicilliq = "";

        boolean yoxlama = true;

        for (int j = 0; j < mass.length-1; j++) {
            int novbetiReqem = ((j + 1) > mass.length) ? mass.length : j + 1;

            if (mass[j] >= mass[novbetiReqem]) {
                yoxlama = false;
                break;
            }
        }
        if (yoxlama == true) {
            ardicilliq = "ardicilliq pozulmayib";
            System.out.println(ardicilliq);
        }else{
            ardicilliq = "ardicilliq pozulub";
            System.out.println(ardicilliq);  
        }

    }
}
