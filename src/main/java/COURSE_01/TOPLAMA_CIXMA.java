/**
 * @Author:
 * @Date: 2024-07-25 11:01:11
 * @LastEditors: 
 * @LastEditTime: 2024-07-25 11:01:15
 * @FilePath: src/main/java/COURSE_01/TOPLAMA_CIXMA.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package COURSE_01;

public class TOPLAMA_CIXMA {
    public static void main(String[] args) {

        //============================================
        int a = 5;
        a++;  //6  //TODO   İNCRİMENT    
        System.out.println("a ++ = " + a);
        a--;  //5 //TODO   DECRİMENT
        System.out.println("a -- = " + a);
        a += 4;
        System.out.println("a += 4 = " + a);
        a -= 2;
        System.out.println("a -= 2 = " + a);

        a *= 2;
        System.out.println("a *= 2 = " + a);

        a /= 2;
        System.out.println("a /= 2 = " + a);

        a %= 2;
        System.out.println("a %= 2 = " + a);

        int b = 2;
        System.out.println("");
        //============================================
        //TODO   Toplama çıxma bolme vurma
        System.out.println("(c) sətir şəklində = " + a + b);
        System.out.println("(c) rəqəm şəklində = " + (a + b));

        //============================================
        System.out.println("");

        System.out.println("toplama cixma vurma bolmə");
        int toplama = a + b;
        System.out.println("toplama= " + toplama);

        int çıxma = a - b;
        System.out.println("çıxma= " + çıxma);

        int vurma = a * b;
        System.out.println("vurma= " + vurma);

        int bolme = a / b;
        System.out.println("bolme= " + bolme);

        double bolme2 = (double) a / b;
        System.out.println("bolme2= " + bolme2);
        //============================================
        System.out.println("");
        double qaliqTam = 54;

        double qalıq = qaliqTam % 10;
        double tam = qaliqTam / 10;
        int tamI = (int) tam;

        System.out.println("qalıq= " + qalıq);
        System.out.println("tam= " + tam);
        System.out.println("tamI= " + tamI);


    }
}
