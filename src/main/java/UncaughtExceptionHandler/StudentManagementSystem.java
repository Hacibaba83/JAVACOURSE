/**
 * @Author:
 * @Date: 2024-08-11 21:24:21
 * @LastEditors: 
 * @LastEditTime: 2024-08-11 21:37:29
 * @FilePath: src/main/java/UncaughtExceptionHandler/StudentManagementSystem.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package UncaughtExceptionHandler;



public class StudentManagementSystem {
    
    public static void main(String[] args)throws Exception{
       
        Thread.setDefaultUncaughtExceptionHandler(new MyExceptionHandler());
        
        test(0);
    }
    
    public static void test(int i) throws Exception{
        System.out.println("bla bla");
        if(i==0){
            throw new Exception();
        }
    }
    
}
