package Exceptions;

import java.util.Scanner;

/**
 * @Author:
 * @Date: 2024-08-06 17:18:50
 * @LastEditors: 
 * @LastEditTime: 2024-08-06 19:18:02
 * @FilePath: src/main/java/Exceptions/Exceptions_Main.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
public class Exceptions_Main {
    public static void main(String[] args) {
//        try {
//            Scanner sc = new Scanner(System.in);
//
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//
//            System.out.println(a / b);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            System.out.println("Xeta bash verdi");
//        }
//
//        try {
//            int[] arr = {};
//            System.out.println(arr[0]);
//        } catch (Exception ex) {
//
//            System.out.println(ex.getClass().getName());
//        }
//
//        System.out.println("Salam");

        Exception_Car b = new Exception_Car();
        if (b.name == null) {
            try {
                throw new MyException("Xeta olmushdur!!!");
            } catch (Exception ex) {
               ex.printStackTrace();
            }

        }
        System.out.println("Yoxlama");

    }
}
