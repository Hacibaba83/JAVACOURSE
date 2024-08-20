/**
 * @Author:
 * @Date: 2024-08-04 19:31:04
 * @LastEditors: 
 * @LastEditTime: 2024-08-04 20:42:24
 * @FilePath: src/main/java/Polymorfizm_Faydalari/main/Bmw.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package Polymorfizm_Faydalari.main;

public class Bmw extends Car{
    public int a = 1;

    public Bmw drive(){
        System.out.println(this.getClass().getName()+ " BMW");
        return null;

    }
}
