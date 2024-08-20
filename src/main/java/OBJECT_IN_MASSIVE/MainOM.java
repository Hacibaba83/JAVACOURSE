/**
 * @Author:
 * @Date: 2024-07-27 21:27:26
 * @LastEditors: 
 * @LastEditTime: 2024-07-27 21:33:00
 * @FilePath: src/main/java/OBJECT_IN_MASSIVE/MainOM.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package OBJECT_IN_MASSIVE;


public class MainOM {

    public static void main(String[] args) {
        UserOM[] arr = new UserOM[2];

        arr[0] = new UserOM();
        arr[1] = new UserOM();
        
        arr[0].b++;

        System.out.println(arr[0].b);
        

    }
    

}
