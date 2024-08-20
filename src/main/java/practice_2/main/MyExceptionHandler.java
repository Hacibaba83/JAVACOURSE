/**
 * @Author:
 * @Date: 2024-08-11 21:28:26
 * @LastEditors: 
 * @LastEditTime: 2024-08-12 17:39:11
 * @FilePath: src/main/java/practice_2/main/MyExceptionHandler.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package practice_2.main;

public class MyExceptionHandler implements Thread.UncaughtExceptionHandler{

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("run time bash verdi");
        e.printStackTrace();
    }
}
