/**
 * @Author:
 * @Date: 2024-07-25 10:45:00
 * @LastEditors: 
 * @LastEditTime: 2024-07-25 10:45:39
 * @FilePath: src/main/java/ARRAYS/ARRAYS.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package ARRAYS;

import java.util.Scanner;

public class ARRAYS {

    public static void main(String[] args) {
        //TODO   ARRAYS MASSIVLER
        //TODO   BIR SIRALI MASSIVLER
        /*
        ||||||||||||||||||||||||||||||||||||
        int[] arr = {1,3,2,4,12};
        int element = arr[4];
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        ||||||||||||||||||||||||||||||||||||
        int[] arr = {0,0,0,0,0};
        arr[0] = 12;
        arr[1] = 33;
        arr[2] = 33;
        arr[3] = 34;
        arr[4] = 14;
              
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        ||||||||||||||||||||||||||||||||||||
        int[] arr = {0, 0, 0, 0, 0};

        System.out.println("daxil edilme");
        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println(i + " ededi daxil edin");
            arr[i] = sc.nextInt();
        }
        System.out.println("chap edilme");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "." + arr[i]);
        }
        ||||||||||||||||||||||||||||||||||||
         int[] arr = new int[5];

        System.out.println("daxil edilme");
        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println(i + " ededi daxil edin");
            arr[i] = sc.nextInt();
        }
        System.out.println("chap edilme");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "." + arr[i]);
        }
        ||||||||||||||||||||||||||||||||||||
         */

        coxSiraliMassiv();
    }

    public static void birSiraliMassiv() {
        int[] arr = new int[5];

        System.out.println("daxil edilme");
        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println(i + " ededi daxil edin");
            arr[i] = sc.nextInt();
        }
        System.out.println("chap edilme");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "." + arr[i]);
        }
    }

    //||||||||||||||||||||||||||||||||||||||||||||||||
    //TODO   COX SIRALI MASSIVLER
    public static void coxSiraliMassiv() {
        int[][] arr = new int[2][5];

        System.out.println("daxil edilme");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("i = "+i + " j= " +j + " ededi daxil edin");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("chap edilme");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("i = "+i + " j= " +j+ "." + arr[i][j]);
            }

        }
    }
    //|||||||||||||||||||||||||||||||||||||||||||||||||||||||   
}
