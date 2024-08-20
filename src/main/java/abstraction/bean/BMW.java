/**
 * @Author:
 * @Date: 2024-08-07 18:28:32
 * @LastEditors: 
 * @LastEditTime: 2024-08-14 21:37:48
 * @FilePath: src/main/java/abstraction/bean/BMW.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
// 'abstraction.bean' paketində olan kod faylını göstərir, bu, sinifin hansı paketdə yerləşdiyini bildirir
package abstraction.bean;

// 'Car' abstrakt sinifini genişləndirən 'BMW' adlı public sinifini tanımlayır
public class BMW extends Car {

    // 'A' adında boş bir static iç sinif tanımlayır, bu sinif 'BMW' sinifinin daxilində istifadə üçün nəzərdə tutulub
    public static class A{

    }

    // 'Car' sinifindən miras alınan 'start' metodunu təyin edir və BMW-nin start prosesini ekrana çap edir
    public void start() {
        System.out.println("BMW start");  // Ekrana "BMW start" mətnini çap edir
    }

    // 'Car' sinifindən miras alınan 'stop' metodunu təyin edir və BMW-nin dayanma prosesini ekrana çap edir
    public void stop() {
        System.out.println("BMW stop");  // Ekrana "BMW stop" mətnini çap edir
    }

    // 'Car' sinifindən miras alınan 'speedUp' metodunu təyin edir və BMW-nin sürətlənmə prosesini ekrana çap edir
    public void speedUp() {
        System.out.println("BMW speed up");  // Ekrana "BMW speed up" mətnini çap edir
    }
}

