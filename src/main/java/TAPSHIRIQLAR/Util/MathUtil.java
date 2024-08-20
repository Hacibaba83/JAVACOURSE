/**
 * @Author:
 * @Date: 2024-07-31 19:23:21
 * @LastEditors: 
 * @LastEditTime: 2024-08-02 18:14:32
 * @FilePath: src/main/java/TAPSHIRIQLAR/Util/MathUtil.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package TAPSHIRIQLAR.Util;

public class MathUtil {

    //|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    public static void bolunenleriTapmaq(int verilmishEded, int devidedBy) {
        for (int i = 0; i <= verilmishEded; i++) {
            if (i % devidedBy == 0) {
                System.out.println(i);
            }
        }
    }

    //|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    public static void ikiyeBolunenleriTapmaq(int verilmishEded) {
        bolunenleriTapmaq(verilmishEded, 2);
    }

    //|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    public static void ssadeEdedlerinTapilmasi(int verilmishEded) {
        for (int i = 1; i <= verilmishEded; i++) {
            int index = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    index++;
                }
                if (index > 2) {
                    break;
                }
            }
            if (index < 3) {
                System.out.println(i);
            }

        }
    }
    //|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    public static void verilenReqenlerinCemi(int verilmishEded) {
        int summa = 0;

        while (verilmishEded > 0) {
            summa = summa + verilmishEded % 10;
            verilmishEded = verilmishEded / 10;
        }

        System.out.println(summa);
    }

    //|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    public static void verilmishEdedinReqemSayi(int verilmishEded) {
        int sayi = 0;
        while (verilmishEded > 0) {
            verilmishEded /= 10;
            sayi += 1;

        }
        System.out.println("daxil edilmish ededin reqem sayi = " + sayi);
    }

    //|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    public static void sadeFactorial(int verilmishEded) {
        int factorial = 1;
        for (int i = 1; i <= verilmishEded; i++) {
            factorial *= i;

        }
        System.out.println(factorial);
    }

    //|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    public static int recrussionFactorial(int verilmishEded) {
        if (verilmishEded == 0) {
            return 1;
        } else {
            return (verilmishEded * recrussionFactorial(verilmishEded - 1));
        }
    }
    //|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    public static void ikiSozunTersiIleMiqayisesi(String verilmishEded) {
        char[] simvolMassivi = verilmishEded.toCharArray();

        boolean beraberdir = true;

        for (int i = 0; i < simvolMassivi.length; i++) {
            if (simvolMassivi[i] != simvolMassivi[simvolMassivi.length - (i + 1)]) {
                beraberdir = false;
                break;
            }
        }
        System.out.println(beraberdir);
    }
    //|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    public static int verilmishEdedlerinTersiİleMuqayise(int verilmishEded){//123
        int reverse = 0;//
        while(verilmishEded > 0 ){//1
            reverse *=10;//320
            reverse += verilmishEded%10;//321
            verilmishEded = verilmishEded/10;//1
        }
        return reverse;
        
    }
    //|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    //|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    

}
