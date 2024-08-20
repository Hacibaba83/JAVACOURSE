/**
 * @Author:
 * @Date: 2024-07-31 21:42:40
 * @LastEditors: 
 * @LastEditTime: 2024-07-31 21:58:01
 * @FilePath: src/main/java/TAPSHIRIQLAR/Exercises_07.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package TAPSHIRIQLAR;

import TAPSHIRIQLAR.Util.MathUtil;

import java.util.Scanner;

public class Exercises_07 {
    public static void main(String[] args) {
        System.out.println("Metni daxil edin");
        Scanner  sc = new Scanner(System.in);
        
        String metn = sc.nextLine();

        MathUtil.ikiSozunTersiIleMiqayisesi(metn);
        
    }
}
