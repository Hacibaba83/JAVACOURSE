/**
 * @Author:
 * @Date: 2024-08-14 18:45:17
 * @LastEditors: 
 * @LastEditTime: 2024-08-14 20:00:15
 * @FilePath: src/main/java/practice_2/service/inter/SaveableProcess.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package practice_2.service.inter;

import practice_2.bean.Config;

public interface SaveableProcess extends Process {
    
    public default void process(){
        processLogic();
        Config.save();
    }

}
