/**
 * @Author:
 * @Date: 2024-08-04 19:33:20
 * @LastEditors: 
 * @LastEditTime: 2024-08-04 20:12:27
 * @FilePath: src/main/java/Polymorfizm_Faydalari/main/PF_Main.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package Polymorfizm_Faydalari.main;

public class PF_Main {
    public static void main(String[] args) {
//  1      Car[] cars = {new Bmw(), new Mercedes()};
//  1      driveAllCars(cars); 
        
        Bmw b = new Bmw();
        System.out.println(b.a);
        b.drive();
        
        Car c = b;
        System.out.println(c.a);
        c.drive();
    }
    
//    1  public static void driveAllCars(Car[] cars){
//    1      for(int i = 0; i<cars.length; i++){
//    1          Car c = cars[i];
//    1          c.drive();
//    1      }
//    1  }
}
