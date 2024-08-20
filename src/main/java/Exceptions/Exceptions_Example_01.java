/**
 * @Author:
 * @Date: 2024-08-06 18:00:10
 * @LastEditors: 
 * @LastEditTime: 2024-08-06 18:32:48
 * @FilePath: src/main/java/Exceptions/Exceptions_Example_01.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package Exceptions;

public class Exceptions_Example_01 {
    public static void main(String[] args) {
        foo(); 
    }
    
    public static void foo(){
        try {
            int[] arr = {};
            System.out.println(arr[0]);
        } catch (Exception ex) {
            StackTraceElement[] st = ex.getStackTrace();
            System.out.println(ex.getClass().getName() + ":" + ex.getMessage());

            for (int i = 0; i < st.length; i++) {
                StackTraceElement stE = st[i];
                System.out.println("        at " + stE.getMethodName() + ")" + stE.getClassName() + ":" + stE.getLineNumber() + ")");
            }
        }
        System.out.println("Salam");
    }
}
