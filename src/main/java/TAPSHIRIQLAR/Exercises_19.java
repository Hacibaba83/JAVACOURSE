/**
 * @Author:
 * @Date: 2024-08-03 16:55:19
 * @LastEditors: 
 * @LastEditTime: 2024-08-03 16:55:55
 * @FilePath: src/main/java/TAPSHIRIQLAR/Exercises_19.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package TAPSHIRIQLAR;

import java.nio.charset.Charset;

public class Exercises_19 {

 
        public static void main(String[] args) {
            System.out.println("List of available character sets: ");

            // Iterate through the available character sets and print their names
            for (String str : Charset.availableCharsets().keySet()) {
                System.out.println(str);
            }
        }
    
}
