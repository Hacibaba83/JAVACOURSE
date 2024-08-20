/**
 * @Author:
 * @Date: 2024-08-07 20:53:45
 * @LastEditors: 
 * @LastEditTime: 2024-08-07 21:14:41
 * @FilePath: src/main/java/interfaces/BMW_Interface.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package interfaces;

public class BMW_Interface extends Car_Interface{
    public static class A{

    }

    public void start() {
        System.out.println("BMW start");
    }

    public void stop() {
        System.out.println("BMW stop");
    }

    public void speedUp() {
        System.out.println("BMW speed up");
    }
}
