/**
 * @Author:
 * @Date: 2024-08-04 19:30:34
 * @LastEditors: 
 * @LastEditTime: 2024-08-04 20:10:31
 * @FilePath: src/main/java/Polymorfizm_Faydalari/main/Car.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package Polymorfizm_Faydalari.main;

public class Car extends Mechanic{
    
    public int a = 2;
    
    public Mechanic drive(){
        System.out.println(this.getClass().getName()+ " Car");
        return null;
    }
    
}
