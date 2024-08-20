/**
 * @Author:
 * @Date: 2024-07-25 11:02:02
 * @LastEditors: 
 * @LastEditTime: 2024-07-25 11:02:14
 * @FilePath: src/main/java/DOVR_OPERATORLARI/LOOP.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package DOVR_OPERATORLARI;

public class LOOP {
    public static void main(String[] args) {
       /*
       1.
       ***********************
       *********************** 
       ***********************
       ***********************
       ***********************
       //TODO   DÖVR OPERATORU İLƏ BAĞLI ƏMƏLİYYATLAR
        for(int  i = 0; i<5 ; i++){
           for(int j=0; j < 5; j++){
               System.out.print("*");
           }
           System.out.println("");
       }
        2.
       *
       ** 
       ***
       ****
       *****
       ||||||||||||||||||||||||||||||||||
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
           
            System.out.println("");
      |||||||||||||||||||||||||||||||||||
        3.
           *
          ** 
         ***
        ****
       *****
       |||||||||||||||||||||||||||||||||
         for (int i = 0; i < 8;i++) {
            
            for (int j = 1; j <= 8; j++) {
                  
                System.out.print("");
                if(j >= (8-i)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");   
                }
            }
            System.out.println("");
        }
        ||||||||||||||||||||||||||||||||||||||
            for (int i = 0; i <= 8; i++) {
            String a = " ";
            String b ="*";
            a = a.repeat(8 - i);
            b = b.repeat(i);
            System.out.println(a+b);
        }
        
        ||||||||||||||||||||||||||||||||||||||||||
                for (int i = 0; i <= 8; i++) {

            for (int j = 0; j < 8 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }

            System.out.println("");

        }
        ||||||||||||||||||||||||||
        
        4.
        === ===
        === ===
        === ===
        === ===
       for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 6; i++) {
                System.out.print("=");
                if (i != 2 && i != 5) {
                    System.out.print(" ");
                } else {
                    if (i != 5) {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }
        
        */

        //TODO      CONTINUE  BREAK
        for (int j = 0; j < 10; j++) {
            if (j == 3) {
                break;
            }
            System.out.println(j + "==");
        }
        System.out.println("for finished");
        //|||||||||||||||||||||||||||||||||
        //TODO      WHILE
        int k=0;
        while (k<10){
            k++;
            if(k==3){
                continue;
            }
            System.out.println("i= "+(k));
        }
        System.out.println("finished");
        //|||||||||||||||||||||||||||||||||
        //TODO      DO WHILE
        int t=0;
        do{
            t++;
            if(t==3){
                continue;
            }
            System.out.println("i= "+(t));
        }while (t<10);
        System.out.println("finished");
    }
}
