/**
 * @Author:
 * @Date: 2024-08-07 20:54:19
 * @LastEditors: 
 * @LastEditTime: 2024-08-07 21:10:12
 * @FilePath: src/main/java/interfaces/Car_Interface.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package interfaces;

public abstract class Car_Interface extends Mechani_Interfaces{
    public abstract void start();

    public abstract void stop();

    public abstract void speedUp();

    public void startAndSpeedUp(){
        start();
        speedUp();
    }
}
