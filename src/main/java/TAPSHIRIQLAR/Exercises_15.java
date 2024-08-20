/**
 * @Author:
 * @Date: 2024-08-02 18:53:52
 * @LastEditors: 
 * @LastEditTime: 2024-08-02 19:35:40
 * @FilePath: src/main/java/TAPSHIRIQLAR/Exercises_15.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package TAPSHIRIQLAR;

public class Exercises_15 {
    public static void main(String[] args) {
        String a = new String("salam");
        String b = new String("sagol");
        String c = new String("gol");

        boolean yoxlama = true;


        if (a.contains(c)) {
            System.out.println("Soz tapildi");
        } else if (b.contains(c)) {
            System.out.println("Soz tapildi");
        } else {
            System.out.println("Soz tapilmadi");
        }

    }
}
