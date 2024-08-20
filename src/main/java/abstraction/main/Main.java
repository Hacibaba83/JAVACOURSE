/**
 * @Author:
 * @Date: 2024-08-07 17:55:39
 * @LastEditors: 
 * @LastEditTime: 2024-08-14 21:39:23
 * @FilePath: src/main/java/abstraction/main/Main.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package abstraction.main;

import abstraction.bean.Car;
import abstraction.bean.Volvo;
import abstraction.bean.BMW;

// 'Main' adlı public sinifini tanımlayır
public class Main {
    // Proqramın əsas giriş nöqtəsi olan 'main' metodunu tanımlayır
    public static void main(String[] args) {

        // 'BMW.A' tipindən 'a' adında yeni bir obyekt yaradır. Bu, 'BMW' sinifinin static iç sinifi olan 'A' sinifinin bir nümunəsidir.
        BMW.A a = new BMW.A();

        // 'Car' tipindən 'bmw' adında yeni bir obyekt yaradır və bu obyekt 'BMW' sinifindən törədilir.
        Car bmw = new BMW();
        // 'bmw' obyektinin 'startAndSpeedUp' metodunu çağırır
        bmw.startAndSpeedUp();

        // 'Volvo' tipindən 'v' adında yeni bir obyekt yaradır.
        Volvo v = new Volvo();
        // Bu sətir şərh altındadır və icra olunmur: v.run();

        // 'Car' tipindən ibarət bir massiv yaradır və bu massivə 'v' obyektini əlavə edir.
        Car[] cars = {v};
        // 'startAllCars' metodunu çağırır və buna 'cars' massivini parametr olaraq verir.
        startAllCars(cars);

        // Anonim sinif yolu ilə 'Car' sinifindən 'c3' adında yeni bir törəmə sinif yaradır.
        class c3 extends Car {

            @Override
            public void start() {
                // Boş metod təriflənir
            }

            @Override
            public void stop() {
                // Boş metod təriflənir
            }

            @Override
            public void speedUp() {
                // Boş metod təriflənir
            }
        };

        // Anonim sinif yolu ilə 'Car' sinifindən 'c1' adında bir obyekt yaradır.
        Car c1 = new Car(){

            @Override
            public void start() {
                // Boş metod təriflənir
            }

            @Override
            public void stop() {
                // Boş metod təriflənir
            }

            @Override
            public void speedUp() {
                // Boş metod təriflənir
            }
        };

        // Anonim sinif yolu ilə 'Car' sinifindən 'c2' adında bir obyekt yaradır.
        Car c2 = new Car(){

            @Override
            public void start() {
                // Boş metod təriflənir
            }

            @Override
            public void stop() {
                // Boş metod təriflənir
            }

            @Override
            public void speedUp() {
                // Boş metod təriflənir
            }
        };

    }

    // 'startAllCars' adında static bir metod tanımlanır, bu metod 'Car' tipindən ibarət bir massivi qəbul edir
    public static void startAllCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            // Massivdəki hər bir 'Car' obyektinin 'start' metodunu çağırır
            cars[i].start();
        }
    }

}

