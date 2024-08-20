/**
 * @Author:
 * @Date: 2024-07-25 10:57:34
 * @LastEditors: 
 * @LastEditTime: 2024-07-25 10:58:06
 * @FilePath: src/main/java/COURSE_01/IF_ELSE.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package COURSE_01;

import java.util.Scanner;

public class IF_ELSE {
    public static void main(String[] args) {
        //TODO    SCANNER Obyekti
        Scanner sc = new Scanner(System.in);

        System.out.println("Zəhmət olmasa a -nı daxil edin");
        double a = sc.nextDouble();//gözləyirdi

        System.out.println("Zəhmət olmasa b -nı daxil edin");
        double b = sc.nextDouble();//gözləyirdi

        System.out.println("Zəhmət olmasa əməliyyatı daxil edin");
        int emeliyyat = sc.nextInt(); //0, 1, 2, 3, 4

        System.out.println("a= " + a + " b= " + b + " , emeliyyat= " + emeliyyat);

        double netice;

        //TODO    IF ELSE EMELIYYATLARI
        if (emeliyyat == 1) {
            netice = a + b;
        } else if (emeliyyat == 2) {
            netice = a - b;
        } else if (emeliyyat == 3) {
            netice = a * b;
        } else if (emeliyyat == 4) {
            netice = a / b;
        } else {
            netice = 0;
        }

        System.out.println("netice = " + netice);


    }
}
