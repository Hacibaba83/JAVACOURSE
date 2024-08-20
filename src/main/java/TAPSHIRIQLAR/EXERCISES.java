/**
 * @Author:
 * @Date: 2024-07-25 11:06:10
 * @LastEditors: 
 * @LastEditTime: 2024-07-25 11:08:09
 * @FilePath: src/main/java/TAPSHIRIQLAR/EXERCISES.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package TAPSHIRIQLAR;

public class EXERCISES {
    public static void main(String[] args) {
        boolean b = sagdanSola("SALAS");
        System.out.println("b= " + b);
    }

    public static boolean sagdanSola(String text) {

        if (text.isEmpty()){
            return false;
        }

        for (int i = 0; i < text.length(); i++) {
            //TODO      CHARAT()
            char sol = text.charAt(i);
            char sag = text.charAt(text.length() - 1 - i);
            System.out.println("----------");
            System.out.println("sol= " + sol);
            System.out.println("sag= " + sag);
            if (sol != sag) {
                return false;
            }
        }
        return true;
    }
}
