/**
 * @Author:
 * @Date: 2024-08-07 18:43:13
 * @LastEditors: 
 * @LastEditTime: 2024-08-14 21:12:57
 * @FilePath: src/main/java/abstraction/bean/Volvo.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package abstraction.bean;

public class Volvo extends Car {
    
    @Override
    public void start() {
        System.out.println("Volvo start");
    }

    @Override
    public void stop() {
        System.out.println("Volvo stop");

    }

    @Override
    public void speedUp() {
        System.out.println("Volvo speed up");

    }
}
