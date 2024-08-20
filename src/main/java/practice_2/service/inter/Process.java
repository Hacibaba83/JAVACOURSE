/**
 * @Author:
 * @Date: 2024-08-12 19:48:44
 * @LastEditors: 
 * @LastEditTime: 2024-08-14 20:00:15
 * @FilePath: src/main/java/practice_2/service/inter/Process.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package practice_2.service.inter;

public interface Process {    
    
    public abstract void processLogic();

    public default void process(){
        processLogic();
    }
}
