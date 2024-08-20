/**
 * @Author:
 * @Date: 2024-08-07 20:48:38
 * @LastEditors: 
 * @LastEditTime: 2024-08-08 12:47:07
 * @FilePath: src/main/java/interfaces/Main_interfaces.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package interfaces;

public class Main_interfaces {

    public static void main(String[] args) {
        Startable_Interface k = new Kia_Interface();
        Startable_Interface[] startables = {k};
        startAllCars(startables);

        Car_Interface b = new BMW_Interface();
        Startable_Interface s = (Startable_Interface) b;
        //Kia_Interface k1 = (Kia_Interface) b;


    }

    public static void startAllCars(Startable_Interface[] cars) {
        for (int i = 0; i < cars.length; i++) {
            cars[i].start();
        }
    }

}
