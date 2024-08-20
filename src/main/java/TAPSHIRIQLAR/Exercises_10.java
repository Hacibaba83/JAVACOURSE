/**
 * @Author:
 * @Date: 2024-08-02 14:19:22
 * @LastEditors: 
 * @LastEditTime: 2024-08-02 15:47:56
 * @FilePath: src/main/java/TAPSHIRIQLAR/Exercises_10.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package TAPSHIRIQLAR;

import java.util.Scanner;

public class Exercises_10 {
    //TODO Yazılmış rəqəmin sözə çevrilməsi: 125: bir yüz iyirmi beş

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int verilmishEded = sc.nextInt();

        String[] teklikler = new String[10];
        String[] onluqlar = new String[10];
        String[] yuzlukler = new String[10];

        teklikler[0] = "";
        teklikler[1] = "bir";
        teklikler[2] = "iki";
        teklikler[3] = "üç";
        teklikler[4] = "dörd";
        teklikler[5] = "beş";
        teklikler[6] = "altı";
        teklikler[7] = "yeddi";
        teklikler[8] = "səkkiz";
        teklikler[9] = "doqquz";
        
        onluqlar[0] = " ";
        onluqlar[1] = " on ";
        onluqlar[2] = " iyirmi ";
        onluqlar[3] = " otuz ";
        onluqlar[4] = " qırx ";
        onluqlar[5] = " əlli ";
        onluqlar[6] = " altmış ";
        onluqlar[7] = " yetmiş ";
        onluqlar[8] = " həştad ";
        onluqlar[9] = " doğsan ";

        yuzlukler[0] = "";
        yuzlukler[1] = "yüz";
        yuzlukler[2] = "ikiyüz";
        yuzlukler[3] = "üçyüz";
        yuzlukler[4] = "dördyüz";
        yuzlukler[5] = "beşyüz";
        yuzlukler[6] = "altıyüz";
        yuzlukler[7] = "yeddiyüz";
        yuzlukler[8] = "səkkizyüz";
        yuzlukler[9] = "doqquzyüz";
        
        String sozle = new String("");
        int index = 0;
        while (verilmishEded > 0) {//1
            int reqem = verilmishEded % 10;//1
            if (index == 0) {
                sozle = teklikler[reqem] + sozle;
            } else if (index == 1) {
                sozle = onluqlar[reqem] + sozle;
            } else if (index == 2) {
                sozle = yuzlukler[reqem] + sozle;
            }
            index++;
            verilmishEded /= 10;
        }

        System.out.println(sozle);


    }

}
