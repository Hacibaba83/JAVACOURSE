/**
 * @Author:
 * @Date: 2024-08-07 18:29:05
 * @LastEditors: 
 * @LastEditTime: 2024-08-14 21:12:58
 * @FilePath: src/main/java/abstraction/bean/Mercedec.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package abstraction.bean;

public class Mercedec extends Car {

    public void start() {
        System.out.println("Mercedec start");
    }

    public void stop() {
        System.out.println("Mercedec stop");
    }

    public void speedUp() {
        System.out.println("Mercedec speed up");
    }  

}
