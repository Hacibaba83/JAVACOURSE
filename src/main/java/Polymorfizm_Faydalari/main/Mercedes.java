/**
 * @Author:
 * @Date: 2024-08-04 19:31:15
 * @LastEditors: 
 * @LastEditTime: 2024-08-04 20:10:48
 * @FilePath: src/main/java/Polymorfizm_Faydalari/main/Mercedes.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package Polymorfizm_Faydalari.main;

public class Mercedes extends Car{

    public Bmw drive(){
        System.out.println(this.getClass().getName()+ " Mercedes");
        return null;
    }
    
}
