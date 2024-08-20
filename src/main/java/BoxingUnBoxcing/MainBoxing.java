/**
 * @Author:
 * @Date: 2024-07-28 20:45:19
 * @LastEditors: 
 * @LastEditTime: 2024-07-28 21:22:53
 * @FilePath: src/main/java/BoxingUnBoxcing/MainBoxing.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package BoxingUnBoxcing;

public class MainBoxing {

    public static void main(String[] args) {

        //TODO      BOXING
        Integer i = 5;
        //TODO      UNBOXING
        int i2 = i;

        Integer i7 = new Integer(5);
        Integer i8 = new Integer(5);
        
        System.out.println(i7 == i);
    }

}
