/**
 * @Author:
 * @Date: 2024-07-25 11:07:29
 * @LastEditors: 
 * @LastEditTime: 2024-07-25 11:07:32
 * @FilePath: src/main/java/TAPSHIRIQLAR/SPLIT.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package TAPSHIRIQLAR;

public class SPLIT {
    public static void main(String[] args) {
        split2();
    }

    //TODO      SPLIT
    public static void split1() {
        String s = "   Salam; necesen;asda    ";

        String[] mass = s.split(";");
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }

    public static void split2() {
        String s = "   Salam necesen   ne    var ne     yox      ";
        String[] mass = s.split(" ");
        String netice = "";

        for (int i = 0; i < mass.length; i++) {
            String elem = mass[i];
            if (!elem.isEmpty()) {
                netice += elem + " ";
            }
        }
        netice = netice.trim();
        System.out.println("netice = " + netice);
    }
}
